public class ComputerPlayer {
    public boolean on = true;
    private Ball ball;
    public boolean i = false ;
    public boolean k = false;

    public ComputerPlayer(Ball ball) {
        this.ball = ball;
    }
    public boolean active() {
        if (on) {
            if (ball.getBally() > BlueTeam.rowPos[3]) {
                i = false;
                k = true;
            } else {
                i = true;
                k = false;
            }
            return true;
        }
        return  false;
    }

}
