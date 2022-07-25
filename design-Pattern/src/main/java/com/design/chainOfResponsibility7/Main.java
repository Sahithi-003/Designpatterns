package com.design.chainOfResponsibility7;

public class Main {
    public static void main(String[] args) {
        //Objects
        Chain chain1 = new Person1();
        Chain chain2 = new Person2();
        Chain chain3 = new Person3();

        //making chains
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        //make request object
        CheckAnswer request = new CheckAnswer(3);

        chain1.checkAnswer(request);
    }
}
