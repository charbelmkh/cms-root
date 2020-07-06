package com.company.cms.controller;

import com.company.cms.dto.CreateCard;
import com.company.cms.model.Card;
import com.company.cms.model.Type;
import com.company.cms.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController()
public class CardController {

    private final CardService cardService;

    @Autowired
    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping(value = "/card", method = RequestMethod.POST)
    @PreAuthorize("hasAuthority('ROLE_admin')")
    public Card createCard(@RequestBody CreateCard request) {

        return cardService.issueCard(request.getCardType(), request.getCardHolderName());

    }

    @RequestMapping(value = "/card/{id}", method = RequestMethod.DELETE)
    @PreAuthorize("hasAnyAuthority('ROLE_admin')")
    public void deleteCard(@PathVariable Integer id) {
        cardService.deleteCard(id);
    }

    @RequestMapping(path = "/card", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('ROLE_admin') or hasAuthority('ROLE_operator')")
    public List<Card> getCards() {
        return cardService.getAllCards();
    }



}
