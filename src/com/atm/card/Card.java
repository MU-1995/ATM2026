package com.atm.card;

import com.atm.account.IAccount;

public class Card implements ICard {

    private IAccount account;
    private String cardNumber;
    private String pin;

    public Card(IAccount account, String cardNumber, String pin) {
        this.account = account;
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public IAccount getAccont() {
        return account;
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getPin() {
        return pin;
    }
}
