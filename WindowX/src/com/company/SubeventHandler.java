package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SubeventHandler implements ActionListener {


        TextField TXT1, TXT2, TXT3;Label Error;

public SubeventHandler(TextField T1, TextField T2, TextField T3,Label E) {
        TXT1 = T1; TXT2 = T2; TXT3 = T3; Error = E;
        }
public void actionPerformed (ActionEvent E){
        int No1, No2, Result,Result1;
        try{

        Result1 = Integer.parseInt(TXT1.getText() ) - Integer.parseInt (TXT2.getText());
        TXT3.setText (Integer.toString((Result1)));

        }
        catch(NumberFormatException e){
        Error.setText("Digits only");
        }
        }

        }