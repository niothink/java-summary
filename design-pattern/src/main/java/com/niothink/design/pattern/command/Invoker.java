package com.niothink.design.pattern.command;

/**
 * @Deacription TODO
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class Invoker {

    private ICommand command;

    public Invoker(ICommand command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }
}
