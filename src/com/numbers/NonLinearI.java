package com.numbers;

public interface NonLinearI extends Iteration {

    boolean checkRoot();
    boolean canWeUseThisMethod();
    //for future graphical interp...
    double getA();
    double getB();
}
