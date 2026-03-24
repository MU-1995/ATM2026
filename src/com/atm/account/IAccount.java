package com.atm.account;

public interface IAccount {
    ICustomer getOwner();
    double getBalance();
    boolean withDraw();
}
