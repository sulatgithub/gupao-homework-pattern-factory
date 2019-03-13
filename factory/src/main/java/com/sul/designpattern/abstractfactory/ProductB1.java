package com.sul.designpattern.abstractfactory;

public class ProductB1 implements IProductB {

    @Override
    public void method3() {
        System.out.println(this.getClass().getSimpleName()+"  method3");
    }

    @Override
    public void method4() {
        System.out.println(this.getClass().getSimpleName()+"  method4");
    }
}
