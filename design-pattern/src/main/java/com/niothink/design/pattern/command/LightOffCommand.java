package com.niothink.design.pattern.command;

/**
 * @Deacription 狗叫声命令类
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class LightOffCommand implements ICommand {

    private LightActionReceiver receiver;

    public LightOffCommand(LightActionReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOff();
    }

    @Override
    public void cancel() {
        receiver.turnOn();
    }
}
