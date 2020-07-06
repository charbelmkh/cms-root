package com.company.cms.model;

public enum CardType {
    //has maximum top up limit
    //has many loading limits (monthly, weekly, yearly)
    PRE_PAID,

    //credit card it will also have limits and fees which will be calculated based on the usage of this card
    CREDIT
}
