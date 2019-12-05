package com.chz.design.pattern.structural.bridge;

public class SavingAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开活期账号");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("活期账号");
    }
}
