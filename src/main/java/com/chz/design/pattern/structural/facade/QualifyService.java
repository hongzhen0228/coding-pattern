package com.chz.design.pattern.structural.facade;

public class QualifyService {

    public boolean isAvailable(PointGift pointGift){
        System.out.println("verifying" + pointGift.getName() + "qualified and amount as well");
        return true;
    }
}
