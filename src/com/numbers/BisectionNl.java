package com.numbers;

public class BisectionNl implements NonLinearI {
    private ArrayPolynom ap;

    BisectionNl(ArrayPolynom sd){
        this.ap = sd;
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean checkRoot() {
        return false;
    }

    @Override
    public boolean canWeUseThisMethod() {
        return false;
    }


    public double getA() {
        return 0;
    }

    @Override
    public double getB() {
        return 0;
    }

    @Override
    public double fault() {
        return 0;
    }

    @Override
    public double stability() {
        return 0;
    }

    @Override
    public double findQ() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
