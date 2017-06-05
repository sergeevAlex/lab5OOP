package com.numbers;

public class ArrayPolynom implements Polynom {
    private int size;
    private double[] koeffs;

    ArrayPolynom(double[] arr){
        this.size = arr.length;
        this.koeffs = arr;
    }

    double getIndex(int i){return 0;}


    @Override
    public double getFunc() {
        return 0;
    }

    @Override
    public double getFirstDer() {
        return 0;
    }

    @Override
    public double getSecondDer() {
        return 0;
    }

    @Override
    public Polynom divide() {
        return null;
    }

    @Override
    public Polynom multy() {
        return null;
    }

    @Override
    public Polynom add() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
