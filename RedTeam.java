import java.awt.*;
import java.awt.image.ImageObserver;

public class RedTeam {
    Image player;
    int[][] rowPositions = new int[4][4];
    int[] rowPos = new int[4];

    public RedTeam(Toolkit t) {
        player = t.getImage("RedPlayer.png");
        rowPos[0] = 80;
        rowPos[1] = 150;

    }
    public void paintTeam(Graphics g, ImageObserver IO) {
        if (Clicker.w) {
            movePlayer(0, -6);
            movePlayer(1, -6);
        }
        if (Clicker.s) {
            movePlayer(0, 6);
            movePlayer(1, 6);
        }
        g.drawImage(player, 500, rowPos[0], 50, 53, IO);
        g.drawImage(player, 500, rowPos[0] + 140, 50, 53, IO);
        g.drawImage(player, 500, rowPos[0] + 280, 50, 53, IO);
        g.drawImage(player, 500, rowPos[0] + 420, 50, 53, IO);

        g.drawImage(player, 300, rowPos[1], 50, 53, IO);
        g.drawImage(player, 300, rowPos[1] + 150, 50, 53, IO);
        g.drawImage(player, 300, rowPos[1] + 300, 50, 53, IO);
    }

    public void movePlayer(int col, int pos) {
        rowPos[col] = rowPos[col] + pos;

    }
}
