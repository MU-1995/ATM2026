package com.atm.card;

import javax.smartcardio.Card;

public interface ICardReader {

    void readCard(String input, Card card);
}
