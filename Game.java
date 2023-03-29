
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;


public class Game {
    JFrame frame;
    JPanel panel;
    Ball ball;
    Toolkit t=Toolkit.getDefaultToolkit();

//    JButton changeView, levelUp, levelDown;

    public Game() throws IOException {
        frame = new JFrame("map tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel("GoodBoard.png");
        panel.setPreferredSize(new Dimension(1200, 650));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setContentPane(panel);
        panel.setLayout(null);
        ball = new Ball(t);

        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
    //rip
    class Panel extends JPanel{
        private Image backgroundImage;
        public Panel(String fileName) throws IOException {
            backgroundImage = ImageIO.read(new File("GoodBoard.png"));
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage,0,0,1200,650,0,0,101,60,this);
            ball.drawBall(g, this);
            System.out.println("WHAT IS GOING ON");
            g.dispose();
        }
    }

    public static void main(String[] args) throws IOException {
        new Game();
    }
}