import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Ball {
    public static int touch;
    private double velocity = 7;
    private double x;
    private double y;
    private double direction;
    Image ball;

    public Ball(Toolkit t)  {
        touch = 0;
        ball = t.getImage("Ball.png");
        x = 527;
        y = 570;
        direction = (Math.random() * (Math.PI / 2) + Math.PI / 4);;
       // direction = Math.PI/2;
    }
    public Image getBallImage () {
        return ball;
    }
    public void ballYShift(){

    }

    public void drawBall(Graphics g, ImageObserver IO) {
        int hitBoxScale = - 30;
        if ((int)x > 470 && (int)x < 500) {
            if ((int)y > BlueTeam.rowPos[0] + hitBoxScale && (int)y < BlueTeam.rowPos[0] - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] - y)/(x - 440));
                touch = 1;
            } else if ((int)y > BlueTeam.rowPos[0] + 110 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 110 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] - y)/(x - 440));
                touch = 2;
            } else if ((int)y > BlueTeam.rowPos[0] + 280 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 280 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] - y)/(x - 440));
                touch = 3;
            } else if ((int)y > BlueTeam.rowPos[0] + 420 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 420 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] - y)/(x - 440));
                touch = 4;
            }


        }

        else if((int)x > 580 && (int)x < 610) {
            if ((int)y > RedTeam.rowPos[0] + hitBoxScale && (int)y < RedTeam.rowPos[0] - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] - y)/(x - 640));
                touch = 11;
            } else if ((int)y > RedTeam.rowPos[0] + 110 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 110 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] - y)/(x - 640));
                touch = 12;
            } else if ((int)y > RedTeam.rowPos[0] + 280 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 280 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] - y)/(x - 640));
                touch = 13;
            } else if ((int)y > RedTeam.rowPos[0] + 420 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 420 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] - y)/(x - 640));
                touch = 14;
            }
        }

        detectWall();


        System.out.println(x + " : " + y);
        y = y - (velocity * Math.sin(direction));
        x = x + (velocity * Math.cos(direction));
        if (velocity > 0)
            velocity = velocity - 0.01;
        else
            velocity = 0;
        g.drawImage(ball, (int)x, (int)y, 45, 47, IO);
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void detectWall() {
        if ((int) x > 1000 || (int) x < 30) {
            direction = Math.PI - direction;
            velocity = velocity * 1.1;
        }

        if ((int)y > 570 || (int)y < 30) {
            direction = 2 * Math.PI - direction;
            velocity = velocity * 1.1;
        }
    }


}
