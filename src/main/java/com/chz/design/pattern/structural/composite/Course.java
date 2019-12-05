package com.chz.design.pattern.structural.composite;

public class Course extends CatalogComponent{

    private String name;
    private double price;
    //private Integer level;

    public Course(String name, double price/*, Integer level*/) {
        this.name = name;
        this.price = price;
        //this.level = level;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public Double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("CourseName: " + name + " price: " + price );
    }
}
