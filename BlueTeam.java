//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

public class BlueTeam {
    Image player;
    Image playerKick;
    public static int[] rowPos = new int[4];

    public BlueTeam(Toolkit t) {
        player = t.getImage("GoodBlue.png");
        playerKick = t.getImage("BlueKick.png");
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

        if (Ball.touch == 1) g.drawImage(playerKick, 460, rowPos[0], 72, 47, IO);
        else g.drawImage(player, 460, rowPos[0], 45, 47, IO);
        if (Ball.touch == 2) g.drawImage(playerKick, 460, rowPos[0] + 140, 72, 47, IO);
        else g.drawImage(player, 460, rowPos[0] + 140, 45, 47, IO);
        if (Ball.touch == 3) g.drawImage(playerKick, 460, rowPos[0] + 280, 72, 47, IO);
        else g.drawImage(player, 460, rowPos[0] + 280, 45, 47, IO);
        if (Ball.touch == 4) g.drawImage(playerKick, 460, rowPos[0] + 420, 72, 47, IO);
        else g.drawImage(player, 460, rowPos[0] + 420, 45, 47, IO);
        if (Ball.touch == 5) g.drawImage(playerKick, 700, rowPos[1], 72, 47, IO);
        else g.drawImage(player, 700, rowPos[1], 45, 47, IO);
        if (Ball.touch == 6) g.drawImage(playerKick, 700, rowPos[1] + 150, 72, 47, IO);
        else g.drawImage(player, 700, rowPos[1] + 150, 45, 47, IO);
        if (Ball.touch == 7) g.drawImage(playerKick, 700, rowPos[1] + 300, 72, 47, IO);
        else g.drawImage(player, 700, rowPos[1] + 300, 45, 47, IO);
        if (Ball.touch == 8) g.drawImage(playerKick, 200, rowPos[2], 72, 47, IO);
        else g.drawImage(player, 200, rowPos[2], 45, 47, IO);
        if (Ball.touch == 9) g.drawImage(playerKick, 200, rowPos[2] + 250, 72, 47, IO);
        else g.drawImage(player, 200, rowPos[2] + 250, 45, 47, IO);
        if (Ball.touch == 10) g.drawImage(playerKick, 90, rowPos[3], 72, 47, IO);
        else g.drawImage(player, 90, rowPos[3], 45, 47, IO);
    }

    public void movePlayer(int col, int pos) {
        rowPos[col] = rowPos[col] + pos;

    }
}

