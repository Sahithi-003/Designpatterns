package com.design.template6;

public class FootBall extends Game{
    @Override
    void initialize() {
        System.out.println("FootBall Game Initialise!");
    }

    @Override
    void startPlay() {
        System.out.println("FootBall Game started!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
