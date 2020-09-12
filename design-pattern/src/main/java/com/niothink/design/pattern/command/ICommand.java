package com.niothink.design.pattern.command;

/**
 * @Deacription 命令行接口
 * @Author niothink@gmail.com
 * @Date 2020/9/12
 * @Version 1.0
 **/
public interface ICommand {

    public void execute();

    public void cancel();
}
