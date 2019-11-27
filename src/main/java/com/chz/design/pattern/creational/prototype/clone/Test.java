package com.chz.design.pattern.creational.prototype.clone;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(0L);
        Pig pig = new Pig("佩琦",date);
        Pig clone = (Pig)pig.clone();
        System.out.println(pig);
        System.out.println(clone);
        pig.getDate().setTime(2131234234532L);
        System.out.println(pig);
        System.out.println(clone);
    }
}
