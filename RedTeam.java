import java.awt.*;
import java.awt.image.ImageObserver;

public class RedTeam {
    Image player;
    int[] rowPositions = new int[3];

    public RedTeam(Toolkit t) {
        player = t.getImage("RedPlayer.png");
        rowPositions[0] = 300;

    }
    public void paintTeam(Graphics g, ImageObserver IO) {
        g.drawImage(player, 500, rowPositions[0], 60, 65, IO);
    }

    public void movePlayer(int row, int pos) {
        rowPositions[row] = rowPositions[row] + pos;

    }
}
