package com.company;

import java.nio.channels.MulticastChannel;

public class Main {

    // public static void main(String[] args) {

      /*  String hello = "Hello";
        String world = " World";
       System.out.println(hello + world); */

     /*   int A = 3;
        int B = 6;
        int Multiplication;
        int Subtraction;
        double Division;

        Multiplication = A + B;
        Subtraction = A - B;
        Division = (double) A / B;
        if (A <= B) {

            System.out.println(Division);
        }
          else{

            System.out.println("Division cannot be performed!");
           } */

    public static void main(String[] args) {
        int Physics = 135;
        int Chemistry = 50;
        int Maths = 100;
        double Total, percentage;
        int phy = Physics / 100 * 60;
        int chem = Chemistry / 100 * 60;
        int math = Maths / 100 * 60;

        Total = Physics + Chemistry + Maths;
        percentage = Total * 100 / 450;

        System.out.println("Physics results are: " + Physics);
        System.out.println("Chemistry results are: " + Chemistry);
        System.out.println("Maths results are: " + Maths);
        System.out.println("Total marks overall are: " + Total);
        System.out.println("Overall percentage: " + percentage + "%");

        if (percentage >= 60) {
            System.out.println("You would of passed ");

            if (phy >= 60) {
                System.out.println("Physics passed");
            } else if (phy <= 60) {
                System.out.println("No");
            }
            if (chem >= 60) {
                System.out.println("Chemsitry passed");
            } else if (chem <= 60) {
                System.out.println("FAIL");

            }

            if (math >= 60) {
                System.out.println("Maths passed");
            } else if (math <= 60) {
                System.out.println("FAILed");

            }
           if(chem<60 || math<60 || phy<60){
            System.out.println("Because you failed one of your exams, You have failed overall");
             }
        }
    }
}