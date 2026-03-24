package com.atm.dispenser;

//If the transaction is successful, the cash is dispensed to the user.
public interface ICashDispenser {
    void dispenseCash(double amount);
}
