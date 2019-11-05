package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(j);
            for (int k = 0; k < (2 + i + 1); k++)
                System.out.print(k);
            System.out.println(i);
        }
    }
}