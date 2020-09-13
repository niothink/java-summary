package com.niothink.design.pattern.state;

/**
 * @Deacription 上下文环境
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void handleState() {
        getState().handleState(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
