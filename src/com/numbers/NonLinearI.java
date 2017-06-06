package com.numbers;

public interface NonLinearI extends Iteration {

    boolean checkRoot();
    boolean canWeUseThisMethod();
    double getA();
    double getB();
    double getRoot();
}
