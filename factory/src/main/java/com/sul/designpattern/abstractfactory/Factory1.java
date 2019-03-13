package com.sul.designpattern.abstractfactory;

public class Factory1 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB1();
    }
}
