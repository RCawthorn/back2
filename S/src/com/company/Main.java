package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Frame F = new Frame("This is a Frame");

        Button B1 = new Button("+");
        Button B2 = new Button("-");
        Button B3 = new Button("x");
        Button B4 = new Button("/");
        TextField T1 = new TextField(10);
        TextField T2 = new TextField(10);
        TextField T3 = new TextField(10);

        Label L1 = new Label("First"); L1.setBackground(Color.BLUE); L1.setForeground(Color.WHITE);
        Label L2 = new Label("Second");  L2.setBackground(Color.BLUE);L2.setForeground(Color.WHITE);
        Label L3 = new Label("Result");
        Label Error = new Label("  "); Error.setBackground(Color.RED);

        F.add(L1);F.add(T1);F.add(L2);F.add(T2);
        F.add(B1);F.add(B2);F.add(B3);F.add(B4);F.add(L3);F.add(T3);F.add(Error);F.setSize(220,300);
        F.setVisible(true);
        F.setBackground(Color.BLACK);

        addeventHandler Plus = new addeventHandler(T1,T2,T3,Error);
        //SubeventHandler Sub = new SubeventHandler(T1,T2,T3,Error);
        //MultiplyeventHandler Multiply = new MultiplyeventHandler(T1,T2,T3,Error);
       // DivideeventHandler Divide = new DivideeventHandler(T1,T2,T3,Error);
        B1.addActionListener(Plus);
       // B2.addActionListener(Sub);
        //B3.addActionListener(Multiply);
      //  B4.addActionListener(Divide);

        FlowLayout Flow = new FlowLayout();
        F.setLayout(Flow);

    }
}
