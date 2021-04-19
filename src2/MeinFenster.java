import java.awt.*;
import java.awt.event.WindowEvent;

public class MeinFenster extends Frame extends WindowListener {

    public MeinFenster() {
        this.addWindowListener();
        this.setTitle("Mein Fenster...");
        this.setSize(300,300);
        this.setVisible(true);
    }

    private void addWindowListener(true){
        
    }

    public void windowActivated(WindowEvent we) {}
    public void windowDeactivated(WindowEvent we) {}

    public void windowOpened(WindowEvent we) {}
    public void windowClosed(WindowEvent we) {}

    public void windowIconified(WindowEvent we) {}
    public void windowDeinconified(WindowEvent we) {}

    public void windowClosing(WindowEvent we) {}
}
