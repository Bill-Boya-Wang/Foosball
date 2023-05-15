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
    private int CPUScore = 0;
    private int playerScore = 0;

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
    public double getBallx() { return x; }
    public double getBally() { return y; }

    public void drawBall(Graphics g, ImageObserver IO) {
        int hitBoxScale = - 30;
        if ((int)x > 470 && (int)x < 500) {
            if ((int)y > BlueTeam.rowPos[0] + hitBoxScale && (int)y < BlueTeam.rowPos[0] - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] - y)/(x - 440));
                touch = 1;
            } else if ((int)y > BlueTeam.rowPos[0] + 110 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 110 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] + 110 - y)/(x - 440));
                touch = 2;
            } else if ((int)y > BlueTeam.rowPos[0] + 280 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 280 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] + 280 - y)/(x - 440));
                touch = 3;
            } else if ((int)y > BlueTeam.rowPos[0] + 420 + hitBoxScale && (int)y < BlueTeam.rowPos[0] + 420 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[0] + 420 - y)/(x - 440));
                touch = 4;
            }
        }

        else if ((int)x > 710 && (int)x < 740) {
            if ((int)y > BlueTeam.rowPos[1] + hitBoxScale && (int)y < BlueTeam.rowPos[1] - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[1] - y)/(x - 680));
                touch = 5;
            } else if ((int)y > BlueTeam.rowPos[1] + 110 + hitBoxScale && (int)y < BlueTeam.rowPos[1] + 110 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[1] + 110 - y)/(x - 680));
                touch = 6;
            } else if ((int)y > BlueTeam.rowPos[1] + 280 + hitBoxScale && (int)y < BlueTeam.rowPos[1] + 280 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[1] + 280 - y)/(x - 680));
                touch = 7;
            }
        }

        else if ((int)x > 190 && (int)x < 220) {
            if ((int)y > BlueTeam.rowPos[2] + hitBoxScale && (int)y < BlueTeam.rowPos[2] - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[2] - y)/(x - 150));
                touch = 8;
            } else if ((int)y > BlueTeam.rowPos[2] + 250 + hitBoxScale && (int)y < BlueTeam.rowPos[2] + 250 - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[2] + 250 - y)/(x - 150));
                touch = 9;
            }
        }

        else if ((int)x > 80 && (int)x < 110) {
            if ((int)y > BlueTeam.rowPos[3] + hitBoxScale && (int)y < BlueTeam.rowPos[3] - hitBoxScale) {
                velocity = 7;
                direction = Math.atan((BlueTeam.rowPos[2] - y) / (x - 30));
                touch = 10;
            }
        }

        else if((int)x > 580 && (int)x < 610) {
            if ((int)y > RedTeam.rowPos[0] + hitBoxScale && (int)y < RedTeam.rowPos[0] - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] - y)/(x - 640));
                touch = 11;
            } else if ((int)y > RedTeam.rowPos[0] + 140 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 140 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] + 140 - y)/(x - 640));
                touch = 12;
            } else if ((int)y > RedTeam.rowPos[0] + 280 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 280 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] + 280 - y)/(x - 640));
                touch = 13;
            } else if ((int)y > RedTeam.rowPos[0] + 420 + hitBoxScale && (int)y < RedTeam.rowPos[0] + 420 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[0] + 420 - y)/(x - 640));
                touch = 14;
            }
        }

        else if((int)x > 300 && (int)x < 330) {
            if ((int)y > RedTeam.rowPos[1] + hitBoxScale && (int)y < RedTeam.rowPos[1] - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[1] - y)/(x - 360));
                touch = 15;
            } else if ((int)y > RedTeam.rowPos[1] + 150 + hitBoxScale && (int)y < RedTeam.rowPos[1] + 150 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[1] + 150 - y)/(x - 360));
                touch = 16;
            } else if ((int)y > RedTeam.rowPos[1] + 300 + hitBoxScale && (int)y < RedTeam.rowPos[1] + 300 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[1] + 300 - y)/(x - 360));
                touch = 17;
            }
        }

        else if((int)x > 820 && (int)x < 850) {
            if ((int)y > RedTeam.rowPos[2] + hitBoxScale && (int)y < RedTeam.rowPos[2] - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[2] - y)/(x - 880));
                touch = 18;
            } else if ((int)y > RedTeam.rowPos[2] + 250 + hitBoxScale && (int)y < RedTeam.rowPos[2] + 250 - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[2] + 250 - y)/(x - 880));
                touch = 19;
            }
        }

        else if((int)x > 960 && (int)x < 990) {
            if ((int)y > RedTeam.rowPos[3] + hitBoxScale && (int)y < RedTeam.rowPos[3] - hitBoxScale) {
                velocity = 7;
                direction = Math.PI-Math.atan((RedTeam.rowPos[3] - y)/(x - 1020));
                touch = 20;
            }
        }

        detectWall();
        detectGoal();

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
    private void detectGoal() {
        if ((int) x >= 1000 &&( (int)y<350 && (int)y>230)) {
            playerScore++;
            reset();
        } else if ((int) x <= 30 &&( (int)y<350 && (int)y>230)) {
            CPUScore++;
            reset();
        }
    }
    public void reset() {
        x = 527;
        y = 570;
        direction = (Math.random() * (Math.PI / 2) + Math.PI / 4);;
    }



    public int getPlayerScore() {
        return playerScore;
    }

    public int getCPUScore() {
        return CPUScore;
    }
}
