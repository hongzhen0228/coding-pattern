package com.chz.design.pattern.structural.decorator.v1;

public class BetterCakeWithSource extends BetterCake{

    @Override
    protected String getDesc() {
        return super.getDesc() + "香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 5;
    }
}
