import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private int velocity = 100;
    private int x;
    private int y;
    Image ball;

    public Ball(Toolkit t) {
        ball = t.getImage("Ball.png");
        x = 250;
        y = 200;
    }
    public Image getBallImage () {
        return ball;
    }
    public void ballYShift(){

    }

    public void drawBall(Graphics g, ImageObserver IO) {
        g.drawImage(ball, x, y, 60, 65, IO);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
