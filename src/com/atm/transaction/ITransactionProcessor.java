package com.atm.transaction;

public interface ITransactionProcessor {
    void transaction(Account account, double amount);
}
