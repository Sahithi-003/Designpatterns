package com.pattern5.decorator;

public class CarColor extends CarDecorator{
    public CarColor(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void build() {
        super.build();
        setColor(decoratedCar);
    }
    public void setColor(Car decoratedCar){
        System.out.println("Red Car");
    }
}
