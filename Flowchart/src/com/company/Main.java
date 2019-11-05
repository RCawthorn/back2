package com.company;

public class Main {

        public static void main(String[] args) {
            int num = 27;
            if (num > 2000) {
                System.out.print("A");
                if (num > 3000) {
                    System.out.print("B");
                }
                else {
                    System.out.print("C");
                    System.out.print("D");

                }

                System.out.print("E");
            }

            else {
                System.out.print("F");

                if (num > 1000) {
                    System.out.print("G");

                }
                if (num > 1500) {
                    System.out.print("I");
                }
                //else{
                System.out.print("K");
            //}
                   if(num<=1500) {
                       System.out.print("L");
                   }


            }



        }
    }



