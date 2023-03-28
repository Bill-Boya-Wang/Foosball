
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game {
    JFrame frame;
    JPanel panel;
    Ball ball;
    Toolkit t=Toolkit.getDefaultToolkit();

//    JButton changeView, levelUp, levelDown;

    public Game() {
        frame = new JFrame("map tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel();
        panel.setPreferredSize(new Dimension(1000, 750));
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
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            ball.drawBall(g, this);
            System.out.println("WHAT IS GOING ON");
            g.dispose();
        }
    }

    public static void main(String[] args){
        new Game();
    }
}