//JavaGui mit Java.awt für den Software Unterricht


import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
    public static void main (String args[]) {
            new Main();
    }

    private Button btn1;
    private Panel pnl1, pnl2, pnl3;
    private TextField feld1, feld2;
    private Label lbl1, lbl2, lbl3;

    public Main() {
        this.feld1 = new TextField("");
        this.feld2 = new TextField("");
        this.lbl1 = new Label("Liter:");
        this.lbl2 = new Label("gefahrene Kilometer:");
        this.lbl3 = new Label("Der PKW verbraucht x Liter auf 100 km!");
        this.btn1 = new Button("Berechne Verbrauch");
        this.btn1.setPreferredSize(new Dimension(50,35));
        this.pnl1 = new Panel();
        this.pnl2 = new Panel();
        this.pnl3 = new Panel();

        this.setTitle("Was verbraucht mein PKW?");
        this.setSize(400,150);
        this.setResizable(false);
        this.setLocation(350,200);
        this.addWindowListener(new WindowListener());
        this.btn1.addActionListener(new MyActionListener());
        this.setBackground(Color.WHITE);


        this.pnl1.setLayout(new GridLayout(2,2));
        this.add("North",pnl1);
        this.pnl1.add((lbl1));
        this.pnl1.add((feld1));
        this.pnl1.add((lbl2));
        this.pnl1.add((feld2));

        this.pnl2.setLayout(new BorderLayout());
        this.add("South",pnl2);
        this.add((lbl3), BorderLayout.CENTER);

        this.pnl3.setLayout(new BorderLayout());
        this.add("South",pnl3);
        this.pnl3.add((btn1), BorderLayout.SOUTH);

        this.setVisible(true);
    }

    static class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e)
        {
            e.getWindow().dispose();
            System.exit(0);
        }
    }
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //btn1.setLabel((lbl3), "HI");
            System.out.println("Schaltfläche wurde gedrückt");
        }
    }
}
