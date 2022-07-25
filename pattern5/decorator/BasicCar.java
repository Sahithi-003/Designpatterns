package com.pattern5.decorator;

public class BasicCar implements Car{
    @Override
    public void build() {
        System.out.println("Basic Car");
    }
}
