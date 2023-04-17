import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private int rockWidth;
    private int rockHeight;
    private int xVelocity;
    private int yVelocity;
    private int xPos;
    private int yPos;
    Image ball;

    public Ball(Toolkit t, int x, int y) {
        ball = t.getImage("Ball.png");
        xPos = x;
        yPos = y;
    }
    public void setX(int x) {
        xPos = x;
    }
    public void setY(int y) {
        yPos = y;
    }
    public void ballYVelocity(){

    }
    public void ballXVelocity(){
                 
    }
    public Image getBallImage () {
        return ball;
    }
    public void drawBall(Graphics g, ImageObserver IO) {
        g.drawImage(ball, xPos, yPos, 50, 53, IO);
    }
}
