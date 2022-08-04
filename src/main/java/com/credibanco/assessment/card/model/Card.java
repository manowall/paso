package com.credibanco.assessment.card.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "card")
public class Card {
    
    @Id
    @Column(name="card_id")
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String cardID;
    
    @Column(name="cardnumber", nullable = false, length = 16)
    private Long cardnumber;
    
    @Column(name="cardholder", nullable = false)
    private String cardholder;
    
    @Column(name="type", nullable = false)
    private String type;
    
    @Column(name="status", nullable = false)
    private String status;
    
    @Column(name="validation_number", nullable = false)
    @Size(min = 1, max = 100)
    private int validation_number;
    
    @Column(name="holderID", nullable = false, length = 12)
    private Long holderID;
    
    @Column(name="holderphone", nullable = false, length = 10)
    private Long holderphone;

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getValidation_number() {
        return validation_number;
    }

    public void setValidation_number(int validation_number) {
        this.validation_number = validation_number;
    }

    public Long getHolderID() {
        return holderID;
    }

    public void setHolderID(Long holderID) {
        this.holderID = holderID;
    }

    public Long getHolderphone() {
        return holderphone;
    }

    public void setHolderphone(Long holderphone) {
        this.holderphone = holderphone;
    }
    
    
        
}
