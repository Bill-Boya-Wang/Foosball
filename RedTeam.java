import java.awt.*;
import java.awt.image.ImageObserver;

public class RedTeam {
    Image player;
    int[] rowPositions = new int[4];

    public RedTeam(Toolkit t) {
        player = t.getImage("RedPlayer.png");
        rowPositions[0] = 80;
        rowPositions[1] = 220;
        rowPositions[2] = 360;
        rowPositions[3] = 500;

    }
    public void paintTeam(Graphics g, ImageObserver IO) {
        if (Clicker.w) {
            movePlayer(0, -6);
            movePlayer(1, -6);
            movePlayer(2, -6);
            movePlayer(3, -6);
        }
        if (Clicker.s) {
            movePlayer(0, 6);
            movePlayer(1, 6);
            movePlayer(2, 6);
            movePlayer(3, 6);
        }
        g.drawImage(player, 500, rowPositions[0], 50, 53, IO);
        g.drawImage(player, 500, rowPositions[1], 50, 53, IO);
        g.drawImage(player, 500, rowPositions[2], 50, 53, IO);
        g.drawImage(player, 500, rowPositions[3], 50, 53, IO);
    }

    public void movePlayer(int row, int pos) {
        rowPositions[row] = rowPositions[row] + pos;

    }
}
