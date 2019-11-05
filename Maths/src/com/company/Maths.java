package com.company;

public class Maths {
    public void doMathWithAbstract(MathsAbstract mathsAbstract) {
        mathsAbstract.add(2,6);
        mathsAbstract.sub(16,32);
    }

    public void doMathWithClass(ProperMaths properMaths) {
        properMaths.add(4,12);
        properMaths.sub(32,64);
    }
}
