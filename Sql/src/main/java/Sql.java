import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.awt.*;
import java.awt.TextField;
import java.awt.BorderLayout;

public class Sql {

 //private static MainMenu View;

    static  int a=0;
    public static void main(String xyz[]) {


        final Frame F = new Frame("Entry Page");
        Label L1 = new Label("Name");
        F.add(L1);
        Label L2 = new Label("Regno");
       // Label.setFont(Font.BOLD);
        Label L3 = new Label("Marks");
        Label L4 = new Label("");
        Label L5 = new Label("");



        TextField T1 = new TextField(10);
        TextField T2 = new TextField(10);
        TextField T3 = new TextField(10);
        GridLayout G1 = new GridLayout(5, 2);
        F.setLayout(G1);
        String Regno = T1.getText();
        String Name = T2.getText();
        String Marks = T3.getText();
        F.setSize(400, 400);

        Panel P1 = new Panel();
        P1.setBackground(Color.BLACK);


        Button Save = new Button("Save");
        Button Remove = new Button("Remove");
        Button Menu = new Button("Menu");

        EventHandler event = new EventHandler(T1,T2,T3,L4);
        RemoveHandler event1 = new RemoveHandler(T1,T2,T3,L4);
        F.setVisible(true);


      Menu.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent actionEvent) {
              if (a==0) {
                  Frame F1 = new Frame("Main Menu");
                  F1.setForeground(Color.BLACK);
                  F1.setVisible(true);
                  Button Entry = new Button("Entry");
                  F.setVisible(false);

                  Button View = new Button("View");
                  // F.setFont(Font.BOLD);
                  Button Quit = new Button("Quit");
                  Entry.setBackground(Color.lightGray);
                  View.setBackground(Color.GRAY);
                  Quit.setBackground(Color.DARK_GRAY);
                  GridLayout G2 = new GridLayout(3, 1);
                  F1.setLayout(G2);
                  F1.setSize(400, 400);
                  F1.add(Entry);F1.add(View);F1.add(Quit);
                 // Quit.addActionListener((ActionListener) Quit);
                  a = 1;
              }

          }
      });
        Button Quit = new Button();
        Quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                F.setVisible(true);
            }
        });

        Remove.addActionListener(event1);

        F.add(L1);F.add(T1);
        F.add(L2);F.add(T2);
        F.add(L3);F.add(T3);
        F.add(L4);
        F.add(Save);F.add(Menu);F.add(Remove);

    }
}

