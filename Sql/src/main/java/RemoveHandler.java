
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class RemoveHandler implements ActionListener {
    TextField Name, Regno, Marks;
    Label ryanslabel;

    public RemoveHandler(TextField T1, TextField T2, TextField T3, Label L4) {
        Name=T1;
        Regno =T2;
        Marks=T3;
        ryanslabel=L4;
    }
    public void actionPerformed(ActionEvent AE) {
        String regno = Regno.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection C = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "password12");
            Statement S = C.createStatement();
            //inserting data
            String query=("DELETE FROM School where Regno ="+regno+";");
            System.out.println(query);
            S.executeUpdate(query);
            ryanslabel.setVisible(true);
            ryanslabel.setText("This entry has now been Deleted");
            Name.setText("");
            Regno.setText("");
            Marks.setText("");

        } catch (Exception E) {
            ryanslabel.setText("Error encountered!");
            System.out.println(E);
        }


    }
}

