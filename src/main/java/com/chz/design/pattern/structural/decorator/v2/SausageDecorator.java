package com.chz.design.pattern.structural.decorator.v2;

public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstratBetterCake abstratBetterCake) {
        super(abstratBetterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
