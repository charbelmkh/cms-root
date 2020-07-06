package com.company.cms.model;

public enum Type {
    //has maximum top up limit
    //has many loading limits (monthly, weekly, yearly)
    PRE_PAID("1"),

    //credit card it will also have limits and fees which will be calculated based on the usage of this card
    CREDIT("2");

    private String cardType;

    Type(String cardType) {
        this.cardType = cardType;
    }
    public String getText() {
        return this.cardType;
    }

    public static Type fromString(String text) {
        for (Type b : Type.values()) {
            if (b.cardType.equalsIgnoreCase(text)) {
                return b;
            }
        }
        return null;
    }
}
