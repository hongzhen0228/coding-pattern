package com.chz.design.pattern.structural.decorator.v1;

public class BetterCakeWithEgg extends BetterCake{

    @Override
    protected String getDesc() {
        return super.getDesc() + "鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
