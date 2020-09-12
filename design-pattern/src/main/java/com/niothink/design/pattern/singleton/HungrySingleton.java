package com.niothink.design.pattern.singleton;

/**
 * 饿汉单例，类加载时就创建单例
 * 特点：线程安全
 * 缺点：类加载时，单例对象就放到内存，如果没有被引用，会造成内存浪费。
 *
 * @Author niothink@gmail.com
 * @Date 2020/9/12
 * @Version 1.0
 **/
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
