package com.chz.design.pattern.structural.decorator.v2;

public class Test {

    public static void main(String[] args) {

        AbstratBetterCake abstratBetterCake;

        abstratBetterCake = new BetterCake();

        abstratBetterCake = new EggDecorator(abstratBetterCake);

        abstratBetterCake = new EggDecorator(abstratBetterCake);

        abstratBetterCake = new SausageDecorator(abstratBetterCake);
    }
}
