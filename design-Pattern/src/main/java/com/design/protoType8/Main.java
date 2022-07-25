package com.design.protoType8;

public class Main {
    public static void main(String[] args) {
        EmployeeRecord e1=new EmployeeRecord(101,"Ram","Software Engineer",30000,"Delhi");
        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
