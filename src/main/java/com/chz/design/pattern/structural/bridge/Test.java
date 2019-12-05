package com.chz.design.pattern.structural.bridge;

public class Test {

    public static void main(String[] args) {
        Bank bank = new ICBCBank(new DepositAccount());

        Account icbcAccount = bank.openAccount();

        icbcAccount.showAccountType();

    }
}
