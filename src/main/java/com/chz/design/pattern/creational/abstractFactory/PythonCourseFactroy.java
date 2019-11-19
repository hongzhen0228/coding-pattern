package com.chz.design.pattern.creational.abstractFactory;

public class PythonCourseFactroy implements CourseFactory{
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}
