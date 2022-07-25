package com.design.template6;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialised!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
    public void test(){
        System.out.println("Testing..");
    }
}
