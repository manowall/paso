package com.credibanco.assessment.card.service.impl;

import com.credibanco.assessment.card.model.Card;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardService {
    Card create(Card card);
    Card upload(Card card);
    void delete(String id);
    Card findById(String id);
    List<Card> findAll();
}
