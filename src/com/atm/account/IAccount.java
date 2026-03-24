package com.atm.account;

import com.atm.customer.ICustomer;

public interface IAccount {
    ICustomer getOwner();
    double getBalance();
    boolean withDraw(double amount);
}
