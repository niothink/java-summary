package com.niothink.design.pattern.observer;

/**
 * @Deacription TODO
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class UserEventRedisListener implements UserEventListener{
    @Override
    public void onEvent(UserEvent userEvent) {
        System.out.println("redis监听器，收到了事件："+userEvent.toString());
    }
}
