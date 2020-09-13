package com.niothink.design.pattern.builder;

/**
 * @Deacription 客户端测试类
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class Client {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder(new Product());
        Director director = new Director(builder);
        director.construct();

        builder.getResult().show();
    }
}
