package com.credibanco.assessment.card.service;

import com.credibanco.assessment.card.model.Card;
import com.credibanco.assessment.card.model.repository.ICardRepository;
import com.credibanco.assessment.card.service.impl.ICardService;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;

public class CardService implements ICardService{
    @Autowired
    ICardRepository iCardRepository;
    
    public int gnrtValid(){
        return (int)(Math.random()*100);
    }
    
    public long gnrtCrdNumber(){
        long numC = (long) (Math.pow(10, 15) + Math.random() * (Math.pow(9,17)));
        return numC;
    }
    
    @Override
    public Card create(Card card){
        card.setValidation_number(gnrtValid());
        return iCardRepository.save(card);
    }
    
    @Override
    public Card upload(Card card){
        return iCardRepository.save(card);
    }
    
    @Override
    public void delete(String id){
        iCardRepository.deleteById(id);
    }
    
    @Override
    public Card findById(String id){
        Optional<Card> optionalCard = iCardRepository.findById(id);
        return optionalCard.orElse(null);
    }
    
    @Override
    public List<Card> findAll(){
        return iCardRepository.findAll();
    }
}
