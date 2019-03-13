package com.sul.designpattern.abstractfactory;

public class Factory2 implements IFactory {

    @Override
    public IProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public IProductB createProductB() {
        return new ProductB2();
    }
}
