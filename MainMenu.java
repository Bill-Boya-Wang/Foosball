import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.IOException; // Import the IOException class to handle errors
import java.awt.Image;
import javax.swing.*;
public class MainMenu extends JPanel implements ActionListener {
    private JButton info;
    private JButton start;
    private JFrame frame;

    private JLabel title;
    private Graphics g;
    private Image pic;
    private final int width = 1200;
    private final int height = 650;
    private Game game;
    private Font  f1 = new Font(Font.SANS_SERIF,  Font.BOLD, 20);
    public MainMenu() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        ImageIcon startButton = new ImageIcon("NewstartButton.png");
        ImageIcon background = new ImageIcon("upgrade.png");
        JLabel label = new JLabel(background);
        start = new JButton("", startButton);
        start.setBounds(235, 500, 320, 120);
        start.setActionCommand("Start");
        start.addActionListener(this);
        label.add(start);
        frame.add(label);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Start")) {
            try {
                Game game = new Game();
                frame.setVisible(false);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new MainMenu();
    }
}
