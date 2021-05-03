import java.awt.*;
import java.awt.event.*;

public class Main extends Frame
{
public static void main (String args[])
    {
        new Main();
    }
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");

    public Main()
    {
        setTitle("Fenster");
        setSize(300,200);
        addWindowListener(new WindowListener());

        setLayout(new GridLayout());
        setBackground(Color.yellow);

        btn1.setForeground(Color.RED);
        btn1.setBackground(Color.WHITE);
        btn1.addActionListener(new MyActionListener());
        add("WEST",btn1);
        btn2.setForeground(Color.RED);
        btn2.setBackground(Color.WHITE);
        btn2.addActionListener(new MyActionListener());
        add("CENTER",btn2);
        btn3.setForeground(Color.RED);
        btn3.setBackground(Color.WHITE);
        btn3.addActionListener(new MyActionListener());
        add("SOUTH",btn3);
        pack(); 

        setVisible(true);
    }

    static class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e)
        {
            e.getWindow().dispose();
            System.exit(0);
        }
    }
    class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) {
            btn1.setBackground(Color.GREEN);
            btn2.setBackground(Color.GREEN);
            btn3.setBackground(Color.GREEN);
            System.out.println("Schaltfläche wurde gedrückt");
        }
}}
