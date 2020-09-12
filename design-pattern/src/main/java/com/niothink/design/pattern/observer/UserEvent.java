package com.niothink.design.pattern.observer;

import java.io.Serializable;

/**
 * @Deacription 用户事件：比如添加/更新
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class UserEvent implements Serializable {

    private String name;

    private String nick;

    private String operator;

    public UserEvent(String name, String nick, String operator) {
        this.name = name;
        this.nick = nick;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserEvent{name=" + name + "nick=" + nick + ", operator=" + operator + "}";
    }
}
