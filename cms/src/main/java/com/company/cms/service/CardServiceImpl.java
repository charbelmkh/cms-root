package com.company.cms.service;

import com.company.cms.dto.CreateCard;
import com.company.cms.model.Card;
import com.company.cms.model.Type;
import com.company.cms.repository.CardRepository;
import com.company.cms.utils.CardUtils;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {


    private final KieSession session;
    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(KieSession session, CardRepository cardRepository) {
        this.session = session;
        this.cardRepository = cardRepository;
    }

    @Override
    public Card issueCard(String cadType, String cardHolderName) {
        Card card = new Card();
        card.setType(Type.fromString(cadType));
        session.insert(card);
        session.fireAllRules();
        card.setHolderName(cardHolderName);
        card.setPan(CardUtils.generateDummyPan());
        card.setExpiryDate(CardUtils.generateDummyExpiryDate());
        return cardRepository.saveAndFlush(card);
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public void deleteCard(Integer id) {
        cardRepository.deleteById(id);
    }

}
