package com.chz.design.pattern.creational.factoryMethod;

public class JavaVideoFactory extends VideoFactory{
    public Video getVideo() {
        return new JavaVideo();
    }
}
