package com.company;

public class DigitsToWorld {

    public String Content(int Num) {
        String Ones[] = {"", "One", "Two", "Three", "Four"};
        String Ty[] = {"", "Twenty", "Thirty", "Fourty", "Fifety"};
        String Result = "";

        if (Num >= 1000) {
            Result = Ones[Num / 1000] + "Thousand";
            Num %= 1000;
        }
        if (Num >= 100) {
            Result = Ones[Num / 100] + 100;
        }
        if (Num >= 1) {
            Result = Ones[Num];
        }
        return Result;
    }

    public static void main(String[] args) {
        DigitsToWord2 D = new DigitsToWord2();
        String Result=D.count(Integer.parseInt(T1.getText));
        T2.setText(Result);

    }
}
