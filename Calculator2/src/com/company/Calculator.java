package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.TextField;
import java.awt.BorderLayout;


public class Calculator {

 /* public static JLabel getBackgroundImage() {
        JLabel j = new JLabel(new ImageIcon("C:\\Users\\ryan-\\Pictures\\calc.jpg"));
        j.setSize(400, 400);
        return j;
    }
*/
    public static void main(String[] args) {



        Frame F = new Frame("CALCULATOR");
        Panel P1 = new Panel();   P1.setBackground(Color.BLACK);
        P1.setForeground(Color.BLACK);
        Panel P2 = new Panel();  P2.setBackground(Color.BLACK);
        P2.setForeground(Color.BLACK);
        GridLayout G1 = new GridLayout(4,4);
        P2.setLayout(G1);
        TextField screen;
        TextField T1 = new TextField(10);
        TextField T2 = new TextField(10);
        TextField T3 = new TextField(10);
        Button Add,sub,Mul,Div,Clear,Equals;
        screen = new TextField(20);
        Label Error=new Label();
        //  JLabel background = getBackgroundImage();
        //  F.add(background);
        Button B1 = new Button("1");Button B2 = new Button("2");Button B3 = new Button("3");Button B4 = new Button("4");
        Button B5 = new Button("5");Button B6= new Button("6");Button B7= new Button("7");Button B8 = new Button("8");
        Button B9 = new Button("9");Button B0 = new Button("0");Button ADD = new Button("+");Button SUB = new Button("-");
        Button CE = new Button("CE");Button EQUALS = new Button("=");
        Button MULTIPLY = new Button("*");Button DIVIDE = new Button("/");
//Colouring of buttons
        MULTIPLY.setBackground(Color.DARK_GRAY); DIVIDE.setBackground(Color.DARK_GRAY);
        ADD.setBackground(Color.DARK_GRAY); SUB.setBackground(Color.DARK_GRAY);EQUALS.setBackground(Color.lightGray);
        CE.setBackground(Color.lightGray); B0.setBackground(Color.lightGray);B1.setBackground(Color.lightGray);
        B2.setBackground(Color.lightGray);B3.setBackground(Color.lightGray);B4.setBackground(Color.lightGray);
        B5.setBackground(Color.lightGray); B6.setBackground(Color.lightGray);B7.setBackground(Color.lightGray);
        B8.setBackground(Color.lightGray);B9.setBackground(Color.lightGray);


//Adding the buttons to the calculator

        P1.add(screen);
        P2.add(B1);P2.add(B2);P2.add(B3);P2.add(B4);P2.add(B5);P2.add(B6);P2.add(B7);P2.add(B8);P2.add(B9);P2.add(B0);
        P2.add(ADD);P2.add(SUB);P2.add(CE);P2.add(EQUALS);P2.add(MULTIPLY);P2.add(DIVIDE);

        //F.setBackground(Color.BLACK);

        Label E = new Label();

        EventHandler event = new EventHandler(screen,T1,T2);
        //DigitsToWord2 D = new DigitsToWord2();

        //ADD.addActionListener(event);
        B1.addActionListener(event);B2.addActionListener(event);
        B3.addActionListener(event);B4.addActionListener(event);
        B5.addActionListener(event);B6.addActionListener(event);
        B7.addActionListener(event);B8.addActionListener(event);
        B9.addActionListener(event);B0.addActionListener(event);
        ADD.addActionListener(event);SUB.addActionListener(event);
        DIVIDE.addActionListener(event); MULTIPLY.addActionListener(event);
        EQUALS.addActionListener(event);CE.addActionListener(event);
//Frame size and positioning
        F.add(P1,BorderLayout.NORTH);
        F.add(P2,BorderLayout.CENTER);
        F.setSize(400,400);
        F.setVisible(true);

    }


}
