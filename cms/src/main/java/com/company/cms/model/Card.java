package com.company.cms.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "card")
@Data
public class Card {

    public Card(){

    }


    public Integer getId() {
        return id;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "holder_name")
    private String holderName;

    @Column(name = "card_type")
    private   Type type;

    @Column(name = "top_up_limit")
    private BigDecimal topUpLimit;
    @Column(name = "loading_limit")
    private BigDecimal loadingLimit;

    @Column(name = "pan")
    private String pan;





    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    private String expiryDate;


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public BigDecimal getTopUpLimit() {
        return topUpLimit;
    }

    public void setTopUpLimit(BigDecimal topUpLimit) {
        this.topUpLimit = topUpLimit;
    }

    public BigDecimal getLoadingLimit() {
        return loadingLimit;
    }

    public void setLoadingLimit(BigDecimal loadingLimit) {
        this.loadingLimit = loadingLimit;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }







}
