package com.sul.designparpattern.SimpleFactory;

public class SimpleFactory {

    public static AbstractProduct createProduct(String type){
        if ("1".equals(type)) {
            return new Product1();
        } else if ("2".equals(type)) {
            return new Product2();
        }
        return null;
    }
}
