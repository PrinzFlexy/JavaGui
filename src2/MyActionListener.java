import java.awt.event.*;
import java.awt.*;

public class MyActionListener implements ActionListener {

    Main m;
    public MyActionListener(Main m){
        Main=m;
    }

    public void actionPerformed(ActionEvent e) {
            m.btn1.setLabel((lbl3), "HI");
            System.out.println("Schaltfläche wurde gedrückt");
        }
    }
}