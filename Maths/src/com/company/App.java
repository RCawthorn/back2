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
        maths.doMathWithInterface(proper);

        // This is kind of weird but it means I can have many implementations and switch them out
        // This is why having methods take in an abstract/interface is seen as good practice
        MathsAbstract silly = new SillyMaths();
        maths.doMathWithInterface(silly);
    }
}