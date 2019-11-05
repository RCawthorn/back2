package com.company;
import javax.xml.transform.Result;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class EventHandler implements ActionListener {


    TextField TXT, TXT1, TXT2;
    Label Error;

    public EventHandler(TextField S, TextField T1, TextField T2) {
        TXT = S;
        TXT1 = T1;
        TXT2 = T2;

    }



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

    public void actionPerformed(ActionEvent AE) {
        int no1, no2, Result;
        try {
          Button Btn;
          Btn = (Button) AE.getSource();
          String sign =Btn.getLabel();

          //Result = Integer.parseInt(TXT1.getText());
          //TXT3.setText(Integer.toString(Result));



       if (sign.equals("0")) {
           no1 = Integer.parseInt(sign);
           TXT.setText(TXT.getText() + no1);
        }
       if (sign.equals("1")){
            TXT.setText(TXT.getText() + sign);
        }
            if (sign.equals("2")){
                TXT.setText(TXT.getText() + sign);
            }

        }
catch(NumberFormatException e) {
   Error.setText("Digits");
}

        }
    }




