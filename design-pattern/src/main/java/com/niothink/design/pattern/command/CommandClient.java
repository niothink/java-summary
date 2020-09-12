package com.niothink.design.pattern.command;

/**
 * @Deacription 请求客户端
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class CommandClient {
    public static void main(String[] args) {
        LightActionReceiver receiver = new LightActionReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        LightOffCommand lightOffCommand = new LightOffCommand(receiver);

        // 开灯
        Invoker invoker = new Invoker(lightOnCommand);
        invoker.call();

        // 关灯
        invoker = new Invoker(lightOffCommand);
        invoker.call();
    }
}
