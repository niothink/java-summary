package com.niothink.design.pattern.observer;

/**
 * @Deacription 观察者模式测试
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class ObserverClient {
    public static void main(String[] args) {
        // 事件源
        UserEventSource source = new UserEventSource();

        // 注册mysql监听器
        source.addListener(new UserEventMysqlListener());
        // 注册redis监听器
        source.addListener(new UserEventRedisListener());

        source.addUser(new UserEvent("张三","张三丰","添加用户信息"));
        source.updateUser(new UserEvent("张三","张三丰2020","更新用户信息"));
    }
}
