package com.chz.design.pattern.structural.facade;

public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();

    private PointPaymentService pointPaymentService = new PointPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointGift pointGift) {

        if (qualifyService.isAvailable(pointGift)
                && pointPaymentService.pay(pointGift)) {
            String s = shippingService.shippingGift(pointGift);
            System.out.println("兑换成功，运单号为： " + s);
        }
    }


}
