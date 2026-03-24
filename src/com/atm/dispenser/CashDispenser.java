package com.atm.dispenser;

public class CashDispenser implements ICashDispenser {

    @Override
    public void dispenseCash(double amount) {
        System.out.println("Printer dine hvidvaskede narko cash $$$" + amount);
    }
}
