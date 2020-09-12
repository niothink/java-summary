package com.niothink.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Deacription TODO
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class UserEventSource {

    private List<UserEventListener> listenerList;

    public UserEventSource() {
        listenerList = new ArrayList<>();
    }

    public void addListener(UserEventListener listener) {
        listenerList.add(listener);
    }

    public void notify(UserEvent userEvent) {
        listenerList.stream().forEach(listener -> {
            listener.onEvent(userEvent);
        });
    }

    /**
     * 添加用户信息
     *
     * @param userEvent
     */
    public void addUser(UserEvent userEvent) {
        notify(userEvent);
    }


    /**
     * 更新用户信息
     *
     * @param userEvent
     */
    public void updateUser(UserEvent userEvent) {
        notify(userEvent);
    }
}
