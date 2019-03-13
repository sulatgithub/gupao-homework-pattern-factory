package com.sul.designpattern.factorymethod;

public class Test {
    public static void main(String[] args) {
        IFactory factory = new Product1Factory();
        IProduct p1 = factory.createProduct();
        p1.insert();
        p1.update();

        factory = new Product2Factory();
        p1 = factory.createProduct();
        p1.insert();
        p1.update();
    }
}
