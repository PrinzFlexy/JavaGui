import java.awt.*;

public class MeinFenster extends Frame {


     public MeinWindowListener mwl = new MeinWindowListener();
     public MeinActionListener mal = new MeinActionListener(this);
         
     public Button btn1;
     public Label lbl3;
     private Panel pnl1, pnl2, pnl3;
     public TextField feld1, feld2;
     private Label lbl1, lbl2;
     double verbrauch = 0;

     public MeinFenster() {
        this.feld1 = new TextField();
        this.feld2 = new TextField();
        this.lbl1 = new Label("Liter:");
        this.lbl2 = new Label("gefahrene Kilometer:");
        this.lbl3 = new Label("Der PKW verbraucht " +verbrauch+ " Liter auf 100 km!");
        this.btn1 = new Button("Berechne Verbrauch");
        this.btn1.setPreferredSize(new Dimension(50,35));
        this.pnl1 = new Panel();
        this.pnl2 = new Panel();
        this.pnl3 = new Panel();

        this.setTitle("Was verbraucht mein PKW?");
        this.setSize(400,150);
        this.setResizable(false);
        this.setLocation(350,200);
        this.addWindowListener(mwl);
        btn1.addActionListener(mal);
        this.setBackground(Color.WHITE);
        this.setAlwaysOnTop(true);

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
    
    public static void main (String args[]) {
          MeinFenster f = new MeinFenster();
    }
}
