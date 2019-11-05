import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainMenu extends Frame {


        public void addActionListener(ActionListener actionListener) {


        Frame FMenu = new Frame("Main Menu");
        Label L6 = new Label("Entry");
        Label L7 = new Label("View");
        Label L8 = new Label("Quit");
        Button View = new Button("View");

        GridLayout G2 = new GridLayout(3, 1);
        FMenu.setLayout(G2);

        FMenu.add(L6);FMenu.add(L7);FMenu.add(L8);
    }


}