package com.niothink.design.pattern.command;

/**
 * @Deacription 鸭叫声命令类
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class LightOnCommand implements ICommand {

    private LightActionReceiver receiver;

    public LightOnCommand(LightActionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOn();
    }

    @Override
    public void cancel() {
        receiver.turnOff();
    }
}
