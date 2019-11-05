package com.company;

public class App {
    public static void main(String[] args) {
        Maths maths = new Maths();

        // I create a class which has to implement the add, sub, multiple
        ProperMaths properMaths = new ProperMaths();
        // I send that class into a function which will call those methods.
        maths.doMathWithClass(properMaths);



        // Getting harder now...
        // I cant create an instance of an abstract. However I can upcast an object to be an abstract
        MathsAbstract proper = new ProperMaths();
//        MathsAbstract silly = new SillyMaths();


        maths.doMathWithAbstract(proper);
//        maths.doMathWithAbstract(silly);
    }
}