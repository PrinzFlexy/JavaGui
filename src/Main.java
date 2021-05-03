import java.awt.*;
import java.awt.event.*;

public class Main extends Frame {
    public static void main (String args[]) {
            new Main();
    }

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    private Panel pnl1, pnl2, pnl3, pnl4, pnl5;

    public Main() {
        this.btn1 = new Button("1");
        this.btn2 = new Button("2");
        this.btn3 = new Button("3");
        this.btn3.setPreferredSize(new Dimension(50,50));
        this.btn4 = new Button("4");
        this.btn4.setPreferredSize(new Dimension(50,50));
        this.btn5 = new Button("5");
        this.btn6 = new Button("6");
        this.btn7 = new Button("7");
        this.btn8 = new Button("8");
        this.btn9 = new Button("9");
        this.btn10 = new Button("10");
        this.pnl1 = new Panel();
        this.pnl2 = new Panel();
        this.pnl3 = new Panel();
        this.pnl4 = new Panel();
        this.pnl5 = new Panel();

        this.setTitle("Fenster");
        this.setSize(300,200);
        this.setResizable(false);
        this.setLocation(350,200);
        this.addWindowListener(new WindowListener());
        this.setBackground(Color.yellow);

        this.pnl1.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.add("South",pnl1);
        this.pnl1.add(btn1);
        this.pnl1.add(btn2);
        
        this.pnl2.setLayout(new BorderLayout());
        this.add("West",pnl2);
        this.pnl2.add((btn3), BorderLayout.NORTH);
        this.pnl2.add((btn4), BorderLayout.SOUTH);

        this.pnl3.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add("North",pnl3);
        this.pnl3.add(btn5);
        this.pnl3.add(btn6);


        this.pnl4.setLayout(new GridLayout(1,3));
        this.add("Center",pnl4);
        this.pnl4.add(btn7);
        this.pnl4.add(btn8);
        this.pnl4.add(btn9);

        this.pnl5.setLayout(new GridLayout(1,1));
        this.add("East",pnl5);
        this.pnl5.add(btn10);

        this.setVisible(true);
    }

    static class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e)
        {
            e.getWindow().dispose();
            System.exit(0);
        }
    }
/*     class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
            System.out.println("Schaltfläche wurde gedrückt");
        }
    } */
}
