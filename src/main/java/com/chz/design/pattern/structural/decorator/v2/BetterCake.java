package com.chz.design.pattern.structural.decorator.v2;

public class BetterCake extends AbstratBetterCake{
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
