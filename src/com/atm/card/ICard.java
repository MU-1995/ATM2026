package com.atm.card;

import com.atm.account.IAccount;

public interface ICard {
    public IAccount getAccont();
    public String getCardNumber();
    public String getPin();
}
