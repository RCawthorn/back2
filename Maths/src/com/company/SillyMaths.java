package com.company;

public class SillyMaths extends MathsAbstract {

    public void add(int a, int b) {
        System.out.println(a+a+a-a-a+b);
    }

    public void sub(int a, int b) {
        System.out.println(a + b - b - b);
    }

    public void multiply(int a, int b) {
        int total = 0;
        for (int i = 0; i< a; i++){
            total += b;
        }
        System.out.println(total);
    }
}
