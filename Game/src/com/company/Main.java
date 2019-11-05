package com.company;
import javax.swing.*;

import java.util.Scanner;

import java.util.Random;

public class Main {





    public static void main(String[] args) {



        Random random = new Random();



        // Use Scanner for getting input from user



        Scanner scanner = new Scanner(System.in);

        String restart;

        int number = random.nextInt(100);

        int guess = -1;



        while (guess != number) {

            System.out.print("Enter your guess: ");



            guess = scanner.nextInt();



            if (guess < number) {



                System.out.println("Too low, please try again");



            }
             /*if (guess < number=) {
                System.out.println("Almost");
            } */


            else if (guess > number) {



                System.out.println("Too high, please try again");







            } else if (guess == guess) {



                // Guess is correct



                System.out.println("Correct, the number was " + number);

            }

            // exit code

            if (guess == 00) {

                System.out.println("Exiting Game");



                break;

            }

        }

    }

}