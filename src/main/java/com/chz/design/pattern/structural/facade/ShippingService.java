package com.chz.design.pattern.structural.facade;

import java.util.UUID;

public class ShippingService {

    public String shippingGift(PointGift pointGift){
        System.out.println("进入物流系统");
        String shippingOrderNum = UUID.randomUUID().toString();
        return shippingOrderNum;
    }
}
