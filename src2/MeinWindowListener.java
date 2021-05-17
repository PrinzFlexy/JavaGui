import java.awt.event.*;

public class MeinWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e)
    {
        e.getWindow().dispose();
        System.exit(0);
    }
}