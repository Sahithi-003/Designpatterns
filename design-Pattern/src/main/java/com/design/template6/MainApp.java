package com.design.template6;

public class MainApp {
    public static void main(String[] args) {
       Game game = new Cricket();
       game.play();

        System.out.println();

        game = new FootBall();
        game.play();

        //Cricket cr1= new Game();
    }
}
