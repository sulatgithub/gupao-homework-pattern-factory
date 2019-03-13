package com.sul.designpattern.factorymethod;

public class Product1Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product1();
    }
}
