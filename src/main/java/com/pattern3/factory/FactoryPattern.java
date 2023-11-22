package com.pattern3.factory;

public class FactoryPattern {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();


        OS os1=osFactory.getOS("ANDROID");
        os1.specifications();

        OS os2=osFactory.getOS("IOS");
        os2.specifications();

    }
}
