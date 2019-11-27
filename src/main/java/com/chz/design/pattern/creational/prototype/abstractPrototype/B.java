package com.chz.design.pattern.creational.prototype.abstractPrototype;

public class B extends A{

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        Object clone = b.clone();

        System.out.println(b);
        System.out.println(clone);
    }
}
