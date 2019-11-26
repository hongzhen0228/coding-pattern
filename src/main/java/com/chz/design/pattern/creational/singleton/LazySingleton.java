package com.chz.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //private static boolean flag = true;
    private LazySingleton() {
        throw new RuntimeException("单例构造器禁止反射调用");
    }

    public synchronized static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /*public static void main(String[] args) throws Exception{
        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazySingleton instance = LazySingleton.getInstance();
        Field flag = instance.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance,true);
        LazySingleton lazySingleton = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(lazySingleton);
        System.out.println(lazySingleton == instance);

    }*/
}
