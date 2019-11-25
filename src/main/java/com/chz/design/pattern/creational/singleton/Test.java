package com.chz.design.pattern.creational.singleton;

public class Test {

    public static void main(String[] args) {
        new Thread(() -> {
            test();
        }).start();
        new Thread(() -> {
            test();
        }).start();

    }


    private static void test() {
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        //ystem.out.println(Thread.currentThread().getName() + ": " + lazyDoubleCheckSingleton);
        StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + staticInnerClassSingleton);
    }
}
