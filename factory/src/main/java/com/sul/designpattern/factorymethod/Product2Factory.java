package com.sul.designpattern.factorymethod;

public class Product2Factory implements IFactory {
    @Override
    public IProduct createProduct() {
        return new Product2();
    }
}
