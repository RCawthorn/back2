package com.company;

public class Nationwide3 {

    public Nationwide3() {
        System.out.println("A");
    }

    public Nationwide3(int a) {
        System.out.println("B");
    }

    public Nationwide3(int a, int b) {
        System.out.println("C");
    }
}
    class Nationwide{
    public static void main(String[] args) {
        Nationwide3 x = new Nationwide3();

    }
}


