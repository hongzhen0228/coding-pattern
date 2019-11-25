package com.chz.design.pattern.creational.singleton;

public class LazyDoubleCheckSingleton {
    // 加volatile不允许重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //1.分配内存
                       //重排序3.设置，指向刚分配的地址
                    //2.初始化
                    //3.设置，指向刚分配的地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
