package com.numbers;

public class ZeydelSl implements SystemMethods,Iteration {
    private Matrix mx;
    private Vectors vc;


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Matrix getKoefs() {
        return null;
    }

    @Override
    public Vectors getValues() {
        return null;
    }

    @Override
    public Vectors faultVector() {
        return null;
    }

    @Override
    public int findMaxRow() {
        return 0;
    }

    @Override
    public int findMaxColumn() {
        return 0;
    }

    @Override
    public Matrix changeMatrix() {
        return null;
    }

    @Override
    public Vectors changeVectors() {
        return null;
    }

    @Override
    public Vectors getRoots() {
        return null;
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
