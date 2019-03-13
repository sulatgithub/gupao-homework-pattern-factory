package com.sul.designpattern.abstractfactory;

public class ProductA2 implements IProductA {
    @Override
    public void method1() {
        System.out.println(this.getClass().getSimpleName()+"  method1");
    }

    @Override
    public void method2() {
        System.out.println(this.getClass().getSimpleName()+"  method2");
    }
}
