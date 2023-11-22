package com.pattern3.factory;

import javafx.scene.shape.Circle;

public class OSFactory {
    public OS getOS(String osType){
        if(osType == null){
            return null;
        }
        if(osType.equalsIgnoreCase("ANDROID")){
            return new Android();

        } else if(osType.equalsIgnoreCase("IOS")){
            return new IOS();}

        return null;
    }
}
