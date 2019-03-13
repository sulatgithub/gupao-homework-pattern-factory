package com.sul.designpattern.factorymethod;

public class Product2 implements IProduct {
    @Override
    public void insert() {
        System.out.println(this.getClass().getSimpleName()+"  insert");
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getSimpleName()+"  update");
    }

    @Override
    public void delete() {
        System.out.println(this.getClass().getSimpleName()+"  delete");
    }
}
