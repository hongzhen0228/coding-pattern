package com.chz.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 */
public class ContainerSingleton {

    private ContainerSingleton() {}

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instance) {
        if (key != null && key.length() > 0 && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}
