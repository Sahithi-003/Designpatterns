package com.pattern1;

public class Data {
    static Data obj=new Data();
    static String obj1="GlobalData";
    private Data(){

    }
    public static Data getInstance(){
        return obj;
    }

}
