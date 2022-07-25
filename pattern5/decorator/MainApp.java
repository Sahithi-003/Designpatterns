package com.pattern5.decorator;

public class MainApp {
    public static void main(String[] args) {
        Car basicCar=new BasicCar();
        Car redCar=new CarColor(new BasicCar());
        basicCar.build();
        redCar.build();
    }
}
