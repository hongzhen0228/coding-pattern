package com.chz.design.pattern.creational.builder.v2;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseArticle("article").build();

        System.out.println(course);
    }
}
