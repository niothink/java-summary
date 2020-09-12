package com.niothink.design.pattern.observer;

/**
 * @Deacription 用户事件监听类
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public interface UserEventListener {
    public void onEvent(UserEvent userEvent);
}
