package com.niothink.design.pattern.builder;

/**
 * 具体的构建实现类
 */
public class ConcreteBuilder extends Builder {

    public ConcreteBuilder(Product product) {
        super(product);
    }

    public void buildPartA() {
        product.setPartA("建造 PartA");
    }

    public void buildPartB() {
        product.setPartB("建造 PartB");
    }

    public void buildPartC() {
        product.setPartC("建造 PartC");
    }
}