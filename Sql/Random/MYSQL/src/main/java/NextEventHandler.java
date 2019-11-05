import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class NextEventHandler implements ActionListener {
    TextField T1,T2,T3; ResultSet Res;



    public NextEventHandler(TextField T1, TextField T2, TextField T3, ResultSet Res) {
        T1=A; T2=B; T3=C; Res=R;

    }
    public void actionPerformed(ActionEvent AE) {
        if(Res.next()){
            T1.setText(Integer.toString(Res.getInt(1)));
        }
    }

    }