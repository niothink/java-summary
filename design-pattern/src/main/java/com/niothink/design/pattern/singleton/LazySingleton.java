package com.niothink.design.pattern.singleton;

/**
 * 懒汉单例，单例对象在被使用时，才会加载到内存
 * 特点：线程不安全
 * 优点：可以避免内存浪费
 *
 * @Author niothink@gmail.com
 * @Date 2020/9/12
 * @Version 1.0
 **/
public class LazySingleton {

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
