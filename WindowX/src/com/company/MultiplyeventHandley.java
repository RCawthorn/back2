package com.company;

import jdk.jfr.SettingControl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MultiplyeventHandler implements ActionListener {


    TextField TXT1, TXT2, TXT3;Label Error;

    public MultiplyeventHandler(TextField T1, TextField T2, TextField T3,Label E) {
        TXT1 = T1; TXT2 = T2; TXT3 = T3; Error = E;
    }
    public void actionPerformed (ActionEvent E){
        int No1, No2, Result,Result2;
        try{

            Result2 = Integer.parseInt(TXT1.getText() ) * Integer.parseInt (TXT2.getText());
            TXT3.setText (Integer.toString((Result2)));

        }
        catch(NumberFormatException e){
            Error.setText("Digits only");
        }
    }

}