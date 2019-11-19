package com.chz.design.pattern.creational.abstractFactory;

public class JavaCourseFactory implements CourseFactory{
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}
