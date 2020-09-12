package com.niothink.design.pattern.command;

/**
 * @Deacription 灯开关处理类
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class LightActionReceiver {

    public void turnOn() {
        System.out.println("开灯了");
    }

    public void turnOff() {
        System.out.println("关灯了");
    }
}
