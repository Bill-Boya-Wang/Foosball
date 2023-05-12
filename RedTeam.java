import java.awt.*;
import java.awt.image.ImageObserver;

public class RedTeam {
    Image player;
    Image playerKick;
    public static int[] rowPos = new int[4];

    public RedTeam(Toolkit t) {
        player = t.getImage("RedPlayer.png");
        playerKick = t.getImage("RedKick.png");
        rowPos[0] = 83;
        rowPos[1] = 145;
        rowPos[2] = 167;
        rowPos[3] = 290;

    }
    public void paintTeam(Graphics g, ImageObserver IO) {
        if (Clicker.i && rowPos[0] > 31) {
            movePlayer(0, -6);
            movePlayer(1, -13);
            movePlayer(2, -16);
        }
        if (Clicker.i && rowPos[3] > 237) {
            movePlayer(3, -13);
        }
        if (Clicker.k && rowPos[3] < 356) {
            movePlayer(3, 13);
        }
        if (Clicker.k && rowPos[0] < 134) {
            movePlayer(0, 6);
            movePlayer(1, 13);
            movePlayer(2, 16);
        }
        if (Ball.touch == 11) g.drawImage(playerKick, 573, rowPos[0], 72, 47, IO);
        else                     g.drawImage(player, 600, rowPos[0], 45, 47, IO);
        if (Ball.touch == 12) g.drawImage(playerKick, 573, rowPos[0] + 140, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[0] + 140, 45, 47, IO);
        if (Ball.touch == 13) g.drawImage(playerKick, 573, rowPos[0] + 280, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[0] + 280, 45, 47, IO);
        if (Ball.touch == 14) g.drawImage(playerKick, 573, rowPos[0] + 420, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[0] + 420, 45, 47, IO);

        if (Ball.touch == 15) g.drawImage(playerKick, 573, rowPos[1], 72, 47, IO);
        else                     g.drawImage(player, 600, rowPos[1], 45, 47, IO);
        if (Ball.touch == 16) g.drawImage(playerKick, 573, rowPos[1] + 150, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[1] + 150, 45, 47, IO);
        if (Ball.touch == 17) g.drawImage(playerKick, 573, rowPos[1] + 300, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[1] + 300, 45, 47, IO);

        if (Ball.touch == 18) g.drawImage(playerKick, 573, rowPos[2], 72, 47, IO);
        else                     g.drawImage(player, 600, rowPos[2], 45, 47, IO);
        if (Ball.touch == 19) g.drawImage(playerKick, 573, rowPos[2] + 250, 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[2] + 250, 45, 47, IO);

        if (Ball.touch == 20) g.drawImage(playerKick, 573, rowPos[3], 72, 47, IO);
        else                    g.drawImage(player, 600, rowPos[3], 45, 47, IO);
    }

    private void movePlayer(int col, int pos) {
        rowPos[col] = rowPos[col] + pos;

    }
}
