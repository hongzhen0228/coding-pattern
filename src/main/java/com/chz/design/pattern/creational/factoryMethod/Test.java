package com.chz.design.pattern.creational.factoryMethod;

public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video javaVideo = videoFactory.getVideo();
        VideoFactory pyFactory = new PythonVideoFactory();
        Video video = pyFactory.getVideo();

        System.out.println(javaVideo.toString() + video);

    }
}
