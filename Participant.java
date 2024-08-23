import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Participant {

    private String name;
    private Scanner scanner;
    private int points;
    private String choice;

    public Participant(String name, Scanner sc) {
        this.name = name;
        this.scanner = sc;
        this.points = 0;
        this.choice = "";
    }

    public String getName() { return this.name; }

    public int getPoints() { return this.points; }

    public void choose() {
        System.out.print(String.format("%s, select rock, paper or scissor: ", this.name));
        String s = this.scanner.next();
        this.choice = s;
        System.out.println(String.format("%s selects %s", this.name, this.choice));
    }

    public int toNumericalChoice() {
        Map<String, Integer> switcher = new HashMap<>();
        switcher.put("rock", 0);
        switcher.put("paper", 1);
        switcher.put("scissor", 2);
        return switcher.get(this.choice);
    }

    public void incrementPoint() {
        this.points++;
    }
}
