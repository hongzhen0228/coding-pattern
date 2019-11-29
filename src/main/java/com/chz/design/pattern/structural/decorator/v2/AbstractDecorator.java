package com.chz.design.pattern.structural.decorator.v2;

public abstract class AbstractDecorator extends AbstratBetterCake{
    private AbstratBetterCake abstratBetterCake;

    public AbstractDecorator(AbstratBetterCake abstratBetterCake) {
        this.abstratBetterCake = abstratBetterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.abstratBetterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstratBetterCake.cost();
    }
}
