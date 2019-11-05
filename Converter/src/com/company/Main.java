package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int a, b,number;
        double sum, sum2, sum3;
        double kgConversion;
        double stoneConversion;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your weight in lbs and we will convert it into Kg and Stones : ");

        a = scan.nextInt();

        //Conversion rate and equation for kilograms

        kgConversion = 0.453;

        sum = a * kgConversion;

        System.out.println("Your weight in kg is " + sum + "Kg");
        stoneConversion = 0.0714;
        sum2 = a * stoneConversion;
        System.out.println("Your weight in stones is " + sum2);








    }

}