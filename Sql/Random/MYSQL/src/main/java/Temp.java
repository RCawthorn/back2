
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Temp {

    static Connection C;
    static Statement S;

    static {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection C = DriverManager.getConnection("jdbc:mysql://localhost/nationwide", "root", "password12");
            Statement S = C.createStatement();
            ResultSet Rs=S.executeQuery("Select * from school");

            while(Rs.next()){
                System.out.println(Rs.getString(1));
                System.out.println(Rs.getInt(2));
                System.out.println(Rs.getInt(3));

            }
        }
        catch (Exception E) {

            System.out.println(E);
        }



    }
    public void showRecord(){
        if(Records.next()){
            Regno.setText(Integer.toString(Records.getInt(1)));
            Name.setText(Records.get(2));
            Marks.setText(Integer.toString(Records.getInt(3)));
        }

        NextEventHandler Nevent = new NextEventHandler(Regno,Name,Marks,Results);
        BackEventHandler Bevent = new NextEventHandler(Regno,Name,Marks,Results);
        Next.addActionListener(Nevent);
        Back.addActionListener(Bevent);
    }
    public static void main (String[]args){
    }
}