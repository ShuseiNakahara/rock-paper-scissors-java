import java.util.HashMap;
import java.util.Map;

public class GameRound {
    
    Participant p1;
    Participant p2;

    // 行、列ともにグー、パー、チョキの順
    private int[][] rules = {
        {0, -1, 1},
        {1, 0, -1},
        {-1, 1, 0},
    };

    public GameRound(Participant p1, Participant p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void start() {
        this.p1.choose();
        this.p2.choose();
        int result = this.compareChoices(this.p1, this.p2);
        System.out.println(String.format("Round resulted in a %s", this.getResultAsString(result)));

        if (result > 0) {
            this.p1.incrementPoint();
        } else if (result < 0) {
            this.p2.incrementPoint();
        }
    }

    public int compareChoices(Participant p1, Participant p2) {
        return this.rules[p1.toNumericalChoice()][p2.toNumericalChoice()];
    }

    public String getResultAsString(int result) {
        Map<Integer, String> res = new HashMap<>();
        res.put(0, "draw");
        res.put(1, "win");
        res.put(-1, "loss");
        return res.get(result);
    }
}
