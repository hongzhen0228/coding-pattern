package com.chz.design.pattern.structural.adapter;

public class PowerAdapter implements DC5{

    private AC220 ac220 = new AC220();
    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220();

        int adapterOutput = adapterInput / 44;

        return adapterOutput;
    }
}
