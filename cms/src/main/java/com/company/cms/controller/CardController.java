package com.company.cms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/card")
public class CardController {

    @RequestMapping(path = "/create",method = RequestMethod.POST)
    public String createCard() {
        return "card Created";
    }
    @RequestMapping(path = "/create",method = RequestMethod.GET)
    public String getCards() {
        return "card Created";
    }
}
