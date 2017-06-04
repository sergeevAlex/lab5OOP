package com.numbers;

public class Slae implements Properties {
    private Matrix mx;
    private Vectors vc;

    public Matrix get_koefs(){
        return mx;
    }

    public Vectors get_values(){
        return vc;
    }

    public boolean diagonal_dominating() {
        return true;

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
