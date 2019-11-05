package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowXP {

    public static JLabel getBackgroundImage() {
        JLabel j = new JLabel(new ImageIcon("C:\\Users\\ryan-\\Pictures\\541343.jpg"));
        j.setSize(400, 400);
        return j;
    }

    public static void main(String[] args) {


        Frame F = new Frame("This is a Frame");
        JLabel background = getBackgroundImage();
        F.add(background);
        Button B1 = new Button("1");
        Button B2 = new Button("2");
        Button B3 = new Button("3");
        Button B4 = new Button("4");
        Button B5 = new Button("5");
        Button B6 = new Button("6");
        Button B7 = new Button("7");
        Button B8 = new Button("8");
        Button B9 = new Button("9");
        Button B10 = new Button("0");
        Button B11 = new Button("+");
        Button B12 = new Button("-");
        Button B13 = new Button("*");
        Button B14 = new Button("/");
        Button B15 = new Button("CE");
        Button B16 = new Button("=");
        TextField T1 = new TextField(10);
        TextField T2 = new TextField(10);
        TextField T3 = new TextField(10);

        Label L1 = new Label("First");
        L1.setBackground(Color.BLUE);
        L1.setForeground(Color.WHITE);
        Label L2 = new Label("Second");
        L2.setBackground(Color.BLUE);
        L2.setForeground(Color.WHITE);
        Label L3 = new Label("Result");
        L3.setBackground(Color.BLUE);
        L3.setForeground(Color.WHITE);
        Label Error = new Label("  ");
        Error.setBackground(Color.RED);

        getBackgroundImage().add(L1);
        background.add(T1);
        background.add(L2);
        background.add(T2);
        background.add(B11);
        background.add(B12);
        background.add(B13);
        background.add(B14);
        background.add(L3);
        background.add(T3);
        background.add(Error);
        F.setSize(450, 500);
        F.setVisible(true);
        //F.setBackground(Color.BLACK);

       //addeventHandler Plus = new addeventHandler(T1, T2, T3, Error);
        //SubeventHandler Sub = new SubeventHandler(T1, T2, T3, Error);
        //MultiplyeventHandler Multiply = new MultiplyeventHandler(T1, T2, T3, Error);
        //DivideeventHandler Divide = new DivideeventHandler(T1, T2, T3, Error);

        B11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int No1, No2, Result;
                try {

                    Result = Integer.parseInt(T1.getText()) + Integer.parseInt(T2.getText());
                    T3.setText(Integer.toString((Result)));

                } catch (NumberFormatException e) {
                    Error.setText("Digits only");

                }
            }
            });
        B12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int No1, No2, Result,Result1;
                try{

                    Result1 = Integer.parseInt(T1.getText() ) - Integer.parseInt (T2.getText());
                    T3.setText (Integer.toString((Result1)));

                }
                catch(NumberFormatException e){
                    Error.setText("Digits only");
                }
            }

        });


        B13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int No1, No2, Result,Result2;
                try{

                    Result2 = Integer.parseInt(T1.getText() ) * Integer.parseInt (T2.getText());
                    T3.setText (Integer.toString((Result2)));

                }
                catch(NumberFormatException e){
                    Error.setText("Digits only");
                }
            }

        });

        B14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int No1, No2,Result3;
                try{

                    Result3 = Integer.parseInt(T1.getText() ) / Integer.parseInt (T2.getText());
                    T3.setText (Integer.toString((Result3)));

                }
                catch(NumberFormatException e){
                    Error.setText("Digits only");
                }
            }
        });

        FlowLayout Flow = new FlowLayout();
        background.setLayout(Flow);

    }
}

