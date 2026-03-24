package com.atm.security;

//The system validates
// that the card pin matches the input pin code and authenticates a transaction.

public interface ISecuritySystem {
    boolean authenticate(String cardPincode, String inputPincode);
}
