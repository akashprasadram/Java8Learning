package com.modernjava.realExample;

public interface AccountFactory {
    public BankAccount  getBankAccount(int id,double balance,String accountName);
}
