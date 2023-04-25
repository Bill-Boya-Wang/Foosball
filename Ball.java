import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private double velocity = 7;
    private int x;
    private int y;
    private double direction;
    Image ball;

    public Ball(Toolkit t) {
        ball = t.getImage("Ball.png");
        x = 527;
        y = 600;
        direction = Math.PI / 2;
    }
    public Image getBallImage () {
        return ball;
    }
    public void ballYShift(){

    }

    public void drawBall(Graphics g, ImageObserver IO) {
        y = y - (int)(velocity * Math.sin(direction));
        x = x + (int)(velocity * Math.cos(direction));
        if (velocity > 0)
            velocity = velocity - 0.05;
        g.drawImage(ball, x, y, 45, 47, IO);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
