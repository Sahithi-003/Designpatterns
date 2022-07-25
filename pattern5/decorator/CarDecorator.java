package com.pattern5.decorator;

public class CarDecorator implements Car{
    protected Car decoratedCar;
    public CarDecorator(Car decoratedCar){
        this.decoratedCar=decoratedCar;
    }
    @Override
    public void build() {
        decoratedCar.build();
    }
}
