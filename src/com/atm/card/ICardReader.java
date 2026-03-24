package com.atm.card;

import javax.smartcardio.Card;

public interface ICardReader {

    ICard readCardNumber(String cardNumber);
}
