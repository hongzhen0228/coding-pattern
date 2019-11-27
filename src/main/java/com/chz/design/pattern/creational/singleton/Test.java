package com.chz.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*new Thread(() -> {
            test();
        }).start();
        new Thread(() -> {
            test();
        }).start();*/

        /*HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(hungrySingleton);
        File file = new File("singleton_file");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton o = (HungrySingleton) objectInputStream.readObject();

        System.out.println(hungrySingleton);
        System.out.println(o);
        System.out.println(hungrySingleton == o);*/

        /*Class objectClass = HungrySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        HungrySingleton singleton = HungrySingleton.getInstance();
        HungrySingleton o = (HungrySingleton) constructor.newInstance();
        System.out.println(singleton);
        System.out.println(o);
        System.out.println(singleton == o);*/
        /*Class<StaticInnerClassSingleton> staticInnerClassSingletonClass = StaticInnerClassSingleton.class;
        Constructor<StaticInnerClassSingleton> declaredConstructor = staticInnerClassSingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        StaticInnerClassSingleton staticInnerClassSingleton = declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(staticInnerClassSingleton);
        System.out.println(instance == staticInnerClassSingleton);*/
        /*Class<LazySingleton> lazySingletonClass = LazySingleton.class;
        Constructor<LazySingleton> declaredConstructor = lazySingletonClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazySingleton lazySingleton = declaredConstructor.newInstance();
        LazySingleton instance = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        System.out.println(instance);
        System.out.println(lazySingleton == instance);*/
        /*EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.setData(new Test());
        Class<EnumInstance> enumInstanceClass = EnumInstance.class;
        Constructor<EnumInstance> declaredConstructor = enumInstanceClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        EnumInstance enumInstance1 = declaredConstructor.newInstance();
        System.out.println(enumInstance.getData());
        System.out.println(enumInstance1.getData());
        System.out.println(enumInstance.getData() == enumInstance1.getData());*/
        /*EnumInstance instance = EnumInstance.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        objectOutputStream.writeObject(instance);
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("singleton_file"));
        EnumInstance o = (EnumInstance)objectInputStream.readObject();
        System.out.println(instance);
        System.out.println(o);
        System.out.println(instance == o);*/

        new Thread(() -> {
            test();
        }).start();

        new Thread(() -> {
            test();
        }).start();
    }


    private static void test() {
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        //ystem.out.println(Thread.currentThread().getName() + ": " + lazyDoubleCheckSingleton);
        /*StaticInnerClassSingleton staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + staticInnerClassSingleton);*/
        ContainerSingleton.putInstance("object", new Object());
        Object object = ContainerSingleton.getInstance("object");
    }
}
