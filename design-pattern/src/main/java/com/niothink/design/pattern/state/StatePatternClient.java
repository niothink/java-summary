package com.niothink.design.pattern.state;

import java.sql.SQLOutput;

/**
 * @Deacription 状态模式测试客户端
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class StatePatternClient {

    public static void main(String[] args) {
        ConcreteStateA stateA = new ConcreteStateA();
        ConcreteStateB stateB = new ConcreteStateB();

        Context context = new Context(stateA);
        context.handleState();
        context = new Context(stateB);
        context.handleState();

    }

}
