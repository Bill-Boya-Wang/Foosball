import java.awt.*;
import java.awt.image.ImageObserver;

public class RedTeam {
    Image player;
    int[] rowPos = new int[4];

    public RedTeam(Toolkit t) {
        player = t.getImage("RedPlayer.png");
        rowPos[0] = 83;
        rowPos[1] = 145;
        rowPos[2] = 167;
        rowPos[3] = 290;

    }
    public void paintTeam(Graphics g, ImageObserver IO) {
        if (Clicker.w && rowPos[0] > 31) {
            movePlayer(0, -6);
            movePlayer(1, -13);
            movePlayer(2, -16);
        }
        if (Clicker.w && rowPos[3] > 237) {
            movePlayer(3, -13);
        }
        if (Clicker.s && rowPos[3] < 356) {
            movePlayer(3, 13);
        }
        if (Clicker.s && rowPos[0] < 134) {
            movePlayer(0, 6);
            movePlayer(1, 13);
            movePlayer(2, 16);
        }

        g.drawImage(player, 500, rowPos[0], 45, 47, IO);
        g.drawImage(player, 500, rowPos[0] + 140, 45, 47, IO);
        g.drawImage(player, 500, rowPos[0] + 280, 45, 47, IO);
        g.drawImage(player, 500, rowPos[0] + 420, 45, 47, IO);

        g.drawImage(player, 300, rowPos[1], 45, 47, IO);
        g.drawImage(player, 300, rowPos[1] + 150, 45, 47, IO);
        g.drawImage(player, 300, rowPos[1] + 300, 45, 47, IO);

        g.drawImage(player, 800, rowPos[2], 45, 47, IO);
        g.drawImage(player, 800, rowPos[2] + 250, 45, 47, IO);

        g.drawImage(player, 980, rowPos[3], 45, 47, IO);
    }

    public void movePlayer(int col, int pos) {
        rowPos[col] = rowPos[col] + pos;

    }
}
