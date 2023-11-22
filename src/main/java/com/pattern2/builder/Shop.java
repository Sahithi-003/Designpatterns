package com.pattern2.builder;

public class Shop {
    public static void main(String[] args) {
//        Phone phn = new Phone("Android",2,3000,5.5);
//        System.out.println(phn);
        Phone phone = new PhoneBuilder().setOs("Android").setRam(4).getPhone();
        System.out.println(phone);
    }
}
