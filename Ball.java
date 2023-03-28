import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private int x;
    private int y;
    Image ball;

    public Ball(Toolkit t) {
        ball = t.getImage("Ball.png");
        x = 200;
        y = 200;
    }
    public Image getBallImage () {
        return ball;
    }

    public void drawBall(Graphics g, ImageObserver IO) {
        g.drawImage(ball, x, y, 60, 60, IO);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
