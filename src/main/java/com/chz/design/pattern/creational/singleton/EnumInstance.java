package com.chz.design.pattern.creational.singleton;

public enum  EnumInstance {

    INSTANCE{
        protected void printTest() {
            System.out.println("chz test");
        }
    };
    private Object data;

    protected abstract void printTest();

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }

}
