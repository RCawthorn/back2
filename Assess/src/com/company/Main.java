package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }

    public String getBert (String input){

        //First, put the string in lower case

        input = input.toLowerCase();

        //Next, count how many times 'bert' appears in the input

        String findbert = input;

        int index = findbert.indexOf("bert");

        int count = 0;

        while (index != -1) {

            count++;

            findbert = findbert.substring(index + 1);

            index = findbert.indexOf("bert");

        }

        //If there are two instances, get the letters in between the two instances

        if (count == 2) {

            int pFrom = input.indexOf("bert") + 4;

            int pTo = input.lastIndexOf("bert");

            String nobert = input.substring(pFrom, pTo);

            //Reverse the letters in nobert

            String reversed = new StringBuilder(nobert).reverse().toString();

            return reversed;

        } else return "";



        public boolean evenlySpaced ( int a, int b, int c){

            //First, find the differences and make them absolute values

            int diff1 = Math.abs(a - b);

            int diff2 = Math.abs(a - c);

            int diff3 = Math.abs(b - c);

            // Then, for each of the letters being the middle letter, check if the differences between them are the same

            if (a > b && a < c || a < b && a > c) {

                if (diff1 == diff2)

                    return true;

                else return false;

            } else if (b > a && b < c || b < a && b > c) {

                if (diff1 == diff3)

                    return true;

                else return false;

            } else if (c > a && c < b || c < a && c > b) {

                if (diff2 == diff3)

                    return true;

                else return false;

            } else return false;

        }


    }





}
