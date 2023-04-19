import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Clicker implements MouseListener, KeyListener {
    public static boolean w = false;
    public static boolean s = false;
    public static boolean i = false;
    public static boolean k = false;
    public void mouseClicked(MouseEvent e) {

    }
    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 87) {
            w = true;
        }
        if (key == 83) {
            s = true;
        }
        if(key == 73) {
            i = true;
        }
        if(key == 75) {
            k = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == 87) {
            w = false;
        }

        if (key == 83) {
            s = false;
        }
        if(key == 73) {
            i = false;
        }
        if(key == 75) {
            k = false;
        }
    }

    public boolean wPressed() {
        return w;
    }

}