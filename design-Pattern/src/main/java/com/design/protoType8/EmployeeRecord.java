package com.design.protoType8;

public class EmployeeRecord implements ProtoType{
    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord(){
    }

    public  EmployeeRecord(int id, String name, String designation, double salary, String address) {

        this();
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    public void showRecord(){
        System.out.println(id+"\t"+name+"\t"+designation+"\t"+salary+"\t"+address);
    }
    @Override
    public ProtoType getClone() {
        return new EmployeeRecord(id,name,designation,salary,address);
    }
}
