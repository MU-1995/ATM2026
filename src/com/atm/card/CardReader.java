package com.atm.card;

import com.atm.account.Account;
import com.atm.customer.Customer;
import com.atm.customer.ICustomer;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader {

    private final Map<String, ICard> validCards = new HashMap<String, ICard>()
    {{
        put(("1234567890"), new Card(new Account(new Customer("John", "Doe"), 5000.00), "1234567890", "1234"));
        put(("0987654321"), new Card(new Account(new Customer("Jane", "Smith"), 3000.00), "0987654321", "4321"));
    }};

    @Override
    public ICard readCardNumber(String cardNumber) {

        if(cardNumber != null && validCards.containsKey(cardNumber)){
            return validCards.get(cardNumber);
        }
        return null;
    }
}
