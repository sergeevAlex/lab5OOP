package com.numbers;

public class LowUpSl implements SystemMethods {
    private Matrix L;
    private Matrix U;
    private Vectors vc;

    public LowUpSl(Matrix mx){
        //some actions to divide on LU
        L = mx;
        U = mx;
    }

    public LowUpSl(Matrix lower,Matrix upper){
        //some actions to divide on LU
        L = lower;
        U = upper;

    }

    public Vectors getRoots(){
        Vectors result = null;
        return result;
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
}
