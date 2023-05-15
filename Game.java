
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Game {
    JFrame frame;
    JPanel panel;
    Ball ball;
    RedTeam red;
    BlueTeam blue;
    ComputerPlayer computer;
    Toolkit t=Toolkit.getDefaultToolkit();

//    JButton changeView, levelUp, levelDown;

    public Game() throws IOException {
        frame = new JFrame("map tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel("FinalizedBoard.png");
        panel.setPreferredSize(new Dimension(1100, 650));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setContentPane(panel);
        panel.setLayout(null);
        ball = new Ball(t);
        computer = new ComputerPlayer(ball);
        red = new RedTeam(t);
        blue = new BlueTeam(t);
        frame.addKeyListener(new Clicker());

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
    //rip
    class Panel extends JPanel implements ActionListener{
        private Image backgroundImage;
        Timer timer = new Timer(8, this);
        public Panel(String fileName) throws IOException {
            backgroundImage = ImageIO.read(new File("FinalizedBoard.png"));
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage,0,0,1100,650,0,0,101,60,this);
            ball.drawBall(g, this);
            red.paintTeam(g, this, computer);
            blue.paintTeam(g, this);
            g.dispose();
            timer.start();
        }

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}