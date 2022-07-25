package com.design.chainOfResponsibility7;

public interface Chain {
     void setNextChain(Chain nextChain);
     void checkAnswer(CheckAnswer request);
}
