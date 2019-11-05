package com.company;

public class Main {


        class Reverse
        {
            // Function to reverse a string in Java using recursion
            public  String reverse(String str)
            {
                // base case: if string is null or empty
                if (str == null || str.equals(""))
                    return str;

                // last character + recur for remaining string
                return str.charAt(str.length() - 1) +
                        reverse(str.substring(0, str.length() - 1));
            }

            public void main (String[] args)
            {
                String str = "Friends";

                // string is immutable
                str = reverse(str);

                System.out.println("Reverse of the given string is : " + str);
            }
        }


}
