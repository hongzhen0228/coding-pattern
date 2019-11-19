package com.chz.design.pattern.creational.factoryMethod;

public class PythonVideoFactory extends VideoFactory{

    public Video getVideo() {
        return new PythonVideo();
    }
}
