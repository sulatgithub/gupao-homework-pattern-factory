package com.sul.designpattern.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IFactory factory = new Factory1();
        IProductA pa1 = factory.createProductA();
        IProductB pb1 = factory.createProductB();
        pa1.method1();
        pa1.method2();
        pb1.method3();
        pb1.method4();
    }
}
