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
    public static int[] rowPos = new int[4];

    public BlueTeam(Toolkit t) {
        this.player = t.getImage("GoodBlue.png");
        this.rowPos[0] = 83;
        this.rowPos[1] = 145;
        this.rowPos[2] = 167;
        this.rowPos[3] = 290;
    }

    public void paintTeam(Graphics g, ImageObserver IO) {
        if (Clicker.i && this.rowPos[0] > 31) {
            this.movePlayer(0, -6);
            this.movePlayer(1, -13);
            this.movePlayer(2, -16);
        }

        if (Clicker.i && this.rowPos[3] > 237) {
            this.movePlayer(3, -13);
        }

        if (Clicker.k && this.rowPos[3] < 356) {
            this.movePlayer(3, 13);
        }

        if (Clicker.k && this.rowPos[0] < 134) {
            this.movePlayer(0, 6);
            this.movePlayer(1, 13);
            this.movePlayer(2, 16);
        }

        g.drawImage(this.player, 600, this.rowPos[0], 45, 47, IO);
        g.drawImage(this.player, 600, this.rowPos[0] + 140, 45, 47, IO);
        g.drawImage(this.player, 600, this.rowPos[0] + 280, 45, 47, IO);
        g.drawImage(this.player, 600, this.rowPos[0] + 420, 45, 47, IO);
        g.drawImage(this.player, 700, this.rowPos[1], 45, 47, IO);
        g.drawImage(this.player, 700, this.rowPos[1] + 150, 45, 47, IO);
        g.drawImage(this.player, 700, this.rowPos[1] + 300, 45, 47, IO);
        g.drawImage(this.player, 200, this.rowPos[2], 45, 47, IO);
        g.drawImage(this.player, 200, this.rowPos[2] + 250, 45, 47, IO);
        g.drawImage(this.player, 90, this.rowPos[3], 45, 47, IO);
    }

    public void movePlayer(int col, int pos) {
        rowPos[col] = rowPos[col] + pos;

    }
}

