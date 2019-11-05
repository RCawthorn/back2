package com.company;

public class Main {

    public static void main(String[] args) {
        int bill, paid, balance;
        bill = 2;
        paid = 50;
        balance = 124;

        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;

        if (balance >= 100) {
            a = balance / 100;
            balance = balance - a * 100;
            System.out.println("You would get " + a + " £100 note");

        }
        if (balance >= 50) {
            b = balance / 50;
            balance = balance - b * 50;
            System.out.println("You would get " + b + " £50 Note");
        }
        if (balance >= 20) {
            c = balance / 20;
            balance = balance - (c * 20);
            System.out.println("You would get " + c + " £20 note");
        }

        if (balance >= 10) {
            d = balance / 10;
            balance = balance - d * 10;
            System.out.print("You would get " + d + " £10 note");
        }

        if (balance >= 5) {
            e = balance / 5;
            balance = balance - e * 5;
            System.out.print("You would get " + e + "£5 Note");


            if (balance >= 1) {
                balance = balance - f * 1;
                f = balance / 1;
                System.out.print("You would get " + f + "£1 coins");
            }
        }
    }
}
