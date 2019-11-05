package com.company;

public class Main {

    public static void main(String[] args) {

        int phy = 10;
        int che = 10;
        int mat = 10;
        double Total;
        double Per;
        Total = phy + che + mat;
        Per = Total * 100 / 450;

        if (Per >= 30) {
            System.out.println(Total);
            System.out.println(Per);
            System.out.println("You have passed the exam");
        }

            else {
            System.out.println("You have failed your exams");
            }
    }
}
