package com.atm.account;

public class Account implements IAccount{

    private ICustomer owner;
    private double balance;


    public Account(ICustomer owner, double balance) {
        this.owner = owner;
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
