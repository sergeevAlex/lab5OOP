package com.numbers;
public class SlaeIterations implements Iteration {
    private Slae system;

    public Vectors simpleIteration(){
        Vectors result = null;
        Matrix A =  system.get_koefs();
        Vectors f = system.get_values();
        /*...*/
        return result;
    }

    public Vectors zeydel(){
        Vectors result = null;
        Matrix A =  system.get_koefs();
        Vectors f = system.get_values();
        /*...*/
        return result;
    }

    @Override
    public int size() {
        //maybe here should be number of iterations, or just system.size();
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
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
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
