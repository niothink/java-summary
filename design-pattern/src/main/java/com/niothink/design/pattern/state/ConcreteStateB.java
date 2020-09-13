package com.niothink.design.pattern.state;

/**
 * @Deacription 状态B实现
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class ConcreteStateB implements State {

    @Override
    public void handleState(Context context) {
        System.out.println("这是状态B");
    }
}
