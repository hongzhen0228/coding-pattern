package com.chz.design.pattern.structural.bridge;

public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    protected abstract Account openAccount();
}
