
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
    Toolkit t=Toolkit.getDefaultToolkit();

//    JButton changeView, levelUp, levelDown;

    public Game() throws IOException {
        frame = new JFrame("map tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel("GoodBoard.png");
        panel.setPreferredSize(new Dimension(1100, 650));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setContentPane(panel);
        panel.setLayout(null);
        ball = new Ball(t);
        red = new RedTeam(t);
        frame.addKeyListener(new Clicker());
//        frame.addKeyListener(new KeyAdapter() {
//            public void keyPressed(KeyEvent event) {
//                int key = event.getKeyCode();
//                if (key == 87) {
//                    red.movePlayer(0, 3);
//                }
//            }
//            public void keyReleased(KeyEvent event) {
//
//            }
//        });

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
    //rip
    class Panel extends JPanel implements ActionListener{
        private Image backgroundImage;
        Timer timer = new Timer(5, this);
        public Panel(String fileName) throws IOException {
            backgroundImage = ImageIO.read(new File("GoodBoard.png"));
        }
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage,0,0,1100,650,0,0,101,60,this);
            ball.drawBall(g, this);
            if (Clicker.w) {
                red.movePlayer(0, -6);
            }
            red.paintTeam(g, this);
            System.out.println("WHAT IS GOING ON");
            g.dispose();
            timer.start();
        }

        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }

    public static void main(String[] args) throws IOException {
        new Game();
    }
}