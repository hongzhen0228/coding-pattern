package com.chz.design.pattern.structural.decorator.v2;

public class EggDecorator extends AbstractDecorator{

    public EggDecorator(AbstratBetterCake abstratBetterCake) {
        super(abstratBetterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
