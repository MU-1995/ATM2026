package com.atm.account;

public class Account implements IAccount{

    private ICustomer customer;
    private double balance;


    public Account(ICustomer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    @Override
    public ICustomer getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public boolean withDraw(double amount) {
        if(balance > 0 && balance > amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " succesful. Current balance: " + balance);
            return true;
        }
        else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
            return false;
        }
    }

}
