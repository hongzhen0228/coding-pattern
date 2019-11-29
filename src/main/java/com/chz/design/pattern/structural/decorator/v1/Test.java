package com.chz.design.pattern.structural.decorator.v1;

public class Test {

    public static void main(String[] args) {

        BetterCake betterCake = new BetterCakeWithEgg();

        BetterCake betterCake1 = new BetterCakeWithSource();



    }
}
