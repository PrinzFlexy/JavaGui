import java.awt.event.*;
import java.awt.*;

public class MeinActionListener implements ActionListener {

    MeinFenster otto;
    public MeinActionListener(MeinFenster f){
        otto=f;
    }

    public void actionPerformed(ActionEvent e) {
        
        double liter = Double.parseDouble(otto.feld1.getText());
        double km = Double.parseDouble(otto.feld2.getText());
        System.out.println("Schaltflaeche wurde gedrueckt");
        
        double verbrauch = liter * 100 / km;
        System.out.println("Der Verbrauch ist: " +verbrauch);
        //otto.lbl3.setText("Der PKW verbraucht " +verbrauch+ " Liter auf 100 km!");
        otto.setTitle("Was verbraucht mein PKW? " +verbrauch+ " Liter auf 100 km!");
        setTimeout(
            otto.setTitle("Was verbraucht mein PKW? ");
            otto.lbl3.setText("Der PKW verbraucht 0 Liter auf 100 km!");
            System.out.println("Eingebene Daten geleert");
        , 8000);
    }
}