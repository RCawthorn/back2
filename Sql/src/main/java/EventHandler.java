import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;

public class EventHandler implements ActionListener {
    TextField Name, Regno, Marks;
    Label ryanslabel;

    public EventHandler(TextField T1, TextField T2, TextField T3, Label L4) {
        Name=T1;
        Regno =T2;
        Marks=T3;
        ryanslabel=L4;
    }
    public void actionPerformed(ActionEvent AE) {
        try {
            //inserting data
          //  DbConnection.S.executeUpdate("insert into School values('"+Name.getText()+"',"+Regno.getText()+","+Marks.getText()+")");
          //  System.out.println(query);
          //  S.executeUpdate(query);
            ryanslabel.setVisible(true);
            ryanslabel.setText("Successfully pushed through!!!");
            Name.setText("");
            Regno.setText("");
            Marks.setText("");
        } catch (Exception E) {
            ryanslabel.setText("Error encountered!");
            System.out.println(E);
        }


    }
    }

