import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.DefaultFormatterFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.awt.Image;
import javax.swing.*;
public class MainMenu extends JPanel implements ActionListener {
    private JButton info;
    private JButton start;
    private JFrame frame;
    private JPanel startPane;
    private JPanel infoPane;
    private Image pic;
    private final int width = 1200;
    private final int height = 650;
    private Game game;
    public MainMenu() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startPane = new JPanel();
        startPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.setSize(800,800);
        ImageIcon startButton = new ImageIcon("NewstartButton.png");
        ImageIcon background = new ImageIcon("newGREEN.png");
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
