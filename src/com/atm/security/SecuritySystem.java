package com.atm.security;

public class SecuritySystem implements ISecuritySystem {

    @Override
    public boolean authenticate(String cardPincode, String inputPincode) {
        //returnerer hvis cardpincode er det samme som inputpincode
        return cardPincode.equals(inputPincode);
    }
}



