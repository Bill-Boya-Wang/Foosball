
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Game {
    JFrame frame;
    JPanel panel;
    Image ball;
    Toolkit t=Toolkit.getDefaultToolkit();

    JButton changeView, levelUp, levelDown;

    public Game() {
        frame = new JFrame("map tester");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new Panel();
        ball = t.getImage("Ball.png");
        panel.setPreferredSize(new Dimension(1000, 750));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setContentPane(panel);

        levelDown = new JButton("Level Down");
        levelUp = new JButton("Level Up");
        panel.setLayout(null);
        panel.add(levelUp);
        panel.add(levelDown);

        levelUp.setBounds(300, 715, 100, 30);
        levelDown.setBounds(450, 715, 100, 30);
        levelDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        levelUp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setLocationRelativeTo(null);
    }
    //rip
    class Panel extends JPanel{
        public void paintComponent(Graphics g) {
            //super.paintComponent(g);
            g.drawImage(ball.getScaledInstance(50, 50, Image.SCALE_DEFAULT), 120,120,this);
            System.out.println("WHAT IS GOING ON");
        }
    }

    public static void main(String[] args){
        new Game();
    }
}