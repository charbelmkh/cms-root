package com.company.cms.service;

import com.company.cms.dto.CreateCard;
import com.company.cms.model.Card;
import com.company.cms.model.Type;

import java.util.List;

public interface CardService {

    Card issueCard(String cadType,String cardHolderName);

    List<Card> getAllCards();

    void deleteCard(Integer id);

}
