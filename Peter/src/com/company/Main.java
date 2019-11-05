package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String peter;
        int salary;
        int Tax = 0, net;
        Scanner scan = new Scanner(System.in);
        int a;

        System.out.println("Enter your salary before tax: ");
        salary = scan.nextInt();


        if (salary >= 40000) {
            Tax = salary * 20/ 100;
            net = salary - Tax;
            System.out.println("This is your yearly salary before tax: " + salary);
            System.out.println("You will pay this much tax: " + Tax);
            System.out.println("This will be your salary after tax: " + net);

        }
        else if (salary <=39999) {
            Tax = salary * 20 / 100;
            net = salary - Tax;
            System.out.println("This is your yearly salary before tax: " + salary);
            System.out.println("You will pay this much tax: " + Tax);
            System.out.println("This will be your salary after tax: " + net);
        }
        else {
            System.out.print("No Tax");
        }
    }

        public static  int num (int sal) {
            try {
                if (sal > 500) {
                    System.out.print("A" + "Bonus of 175");
                    sal += 175;
                    if (sal > 1000) {
                        System.out.print("B" + "Bonus of 150");
                        sal += 150;
                    }

                } else {
                    System.out.print("C" + "Bonus of 100");
                    sal += 100;
                }
                return sal;
            }
            catch(Arr)
        }
    }















