package com.numbers;
import com.numbers.BisectionNl;
import com.numbers.NonLinearI;

public class Main {
    public static void main(String[] args) {
        Matrix L = null;
        Matrix U = null;
        double result = 0;
        double[] array = {1,2,3,4,5};
        Polynom ap = new ArrayPolynom(array);
        Shturm st = new Shturm(ap,-10,10);

        if(st.getNumberOfRoots() == 1) {
            NonLinearI th = new BisectionNl(ap,-10,10);
            result = th.getRoot();
        }

        System.out.println(result);
        Matrix M = null;
        SystemMethods ms = new LowUpSl(M);
        Vectors roots = ms.getRoots();
        System.out.println(roots);

    }
}
