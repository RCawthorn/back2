package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int a;
        System.out.println("Enter Number to convert into words");
       Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        Main m = new Main();
        m.Convert(a);


    }

    private String Ones(int no) {
        String word = "";
        switch (no) {
            case 1:
                word = "one";
                break;
            case 2:
                word = "Two";
                break;
            case 3:
                word = "Three";
                break;
            case 4:
                word = "Four";
                break;
            case 5:
                word = "Five";
                break;
            case 6:
                word = "Six";
                break;
            case 7:
                word = "Seven";
                break;
            case 8:
                word = "Eight";
                break;
            case 9:
                word = "Nine";
                break;
        }

            return word;
    }
        private String Ty(int no){
            String word = "";
            switch (no) {
                case 1:
                    word = "Twenty";
                    break;
                case 2:
                    word = "Thirty";
                    break;
                case 3:
                    word = "Fourty";
                    break;
            }
                return word;

        }
        public void Convert(int Num){
        String Result="";
        if (Num>=1) {

        Result=Ones(Num);
        }
            if (Num>=20) {
                Result = Ty(Num / 10 * 10);
                Num = Num - (Num / 10 * 10);

            }
            if (Num>=100){
                Result=Ones(Num/100)+"Hundred";
                Num%=100;
            }

        if (Num>=1000){
            Result=Ones(Num/1000)+"Thousand";
            Num%=1000;
        }
        System.out.println(Result);
        }


}
