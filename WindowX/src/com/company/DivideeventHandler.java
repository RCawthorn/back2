package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DivideeventHandler implements ActionListener {


    TextField TXT1, TXT2, TXT3;Label Error;

    public DivideeventHandler(TextField T1, TextField T2, TextField T3,Label E) {
        TXT1 = T1; TXT2 = T2; TXT3 = T3; Error = E;
    }
    public void actionPerformed (ActionEvent E){
        int No1, No2,Result3;
        try{

            Result3 = Integer.parseInt(TXT1.getText() ) / Integer.parseInt (TXT2.getText());
            TXT3.setText (Integer.toString((Result3)));

        }
        catch(NumberFormatException e){
            Error.setText("Digits only");
        }
    }

}