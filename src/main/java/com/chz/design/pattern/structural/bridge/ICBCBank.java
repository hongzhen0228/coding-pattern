package com.chz.design.pattern.structural.bridge;

public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    protected Account openAccount() {
        System.out.println("打开中国工商银行");
        account.openAccount();
        return account;
    }
}
