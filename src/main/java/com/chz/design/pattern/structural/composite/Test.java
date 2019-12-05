package com.chz.design.pattern.structural.composite;

public class Test {

    public static void main(String[] args) {

        CatalogComponent linuxCourse = new Course("linux课程",11);

        CatalogComponent windowsCourse = new Course("windows课程",11);

        CatalogComponent windowsCourseCatalog = new CourseCatalog("java课程目录",2);

        CatalogComponent mmCourse = new Course("Java电商1期",18);

        CatalogComponent mm2Course = new Course("Java电商2期",18);

        CatalogComponent patternCourse = new Course("Java设计模式",77);

        CatalogComponent mainCourseCatalog = new CourseCatalog("主目录",1);

        mainCourseCatalog.add(linuxCourse);

        mainCourseCatalog.add(windowsCourse);

        mainCourseCatalog.add(mmCourse);

        mainCourseCatalog.add(mm2Course);

        mainCourseCatalog.add(patternCourse);

        mainCourseCatalog.print();

    }
}
