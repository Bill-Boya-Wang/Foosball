import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    private double velocity = 7;
    private double x;
    private double y;
    private double direction;
    Image ball;

    public Ball(Toolkit t) {
        ball = t.getImage("Ball.png");
        x = 527;
        y = 600;
        direction = (Math.random() * (Math.PI / 2) + Math.PI / 4);;
    }
    public Image getBallImage () {
        return ball;
    }
    public void ballYShift(){

    }

    public void drawBall(Graphics g, ImageObserver IO) {
//        if ((int)x > 600 && (int)x < 650) {
//            if((int)y > ) {
//
//            }
//        }

        y = y - (velocity * Math.sin(direction));
        x = x + (velocity * Math.cos(direction));
        System.out.println(direction);
        if (velocity > 0)
            velocity = velocity - 0.05;
        else
            velocity = 0;
        g.drawImage(ball, (int)x, (int)y, 45, 47, IO);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }


}
