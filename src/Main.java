import java.awt.*;
import java.awt.event.*;
import java.io.Console;

public class Main extends Frame
{
    public static void main (String args[])
    {
        new Main();
    }

    public Main()
    {
        setTitle("Fenster");
        setSize(300,200);
        addWindowListener(new WindowListener());
        //addKeyListener(new KeyListener());
        setLayout(new BorderLayout());
        setBackground(Color.yellow);

        add(new Label("Mitte", Label.CENTER), BorderLayout.CENTER);
        add(new Label("West", Label.CENTER), BorderLayout.WEST);
        add(new Label("Ost", Label.CENTER), BorderLayout.EAST);
        add(new Label("Nord", Label.CENTER), BorderLayout.NORTH);
        add(new Label("Süd", Label.CENTER), BorderLayout.SOUTH);

        setVisible(true);
    }

    /*static class KeyListener extends KeyAdapter  {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            SystemColor.getColor(keyTyped("e"));
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    };*/

    static class WindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e)
        {
            e.getWindow().dispose();
            System.exit(0);
        }
    }
}