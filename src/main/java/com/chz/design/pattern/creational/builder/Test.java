package com.chz.design.pattern.creational.builder;

public class Test {

    public static void main(String[] args) {

        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("coding","ppt","video","article","qa");
        System.out.println(course);
    }
}
