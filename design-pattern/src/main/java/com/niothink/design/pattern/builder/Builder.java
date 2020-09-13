package com.niothink.design.pattern.builder;

import java.lang.annotation.Retention;

/**
 * @Deacription TODO
 * @Author niothink@gmail.com
 * @Date 2020/9/13
 * @Version 1.0
 **/
public abstract class Builder {

    protected Product product;

    public Builder(Product product) {
        this.product = product;
    }

    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract void buildPartC();

    public Product getResult() {
        return product;
    }
}
