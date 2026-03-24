package com.atm.transaction;

import com.atm.account.IAccount;

public interface ITransactionProcessor {
    void transaction(IAccount account, double amount);
}
