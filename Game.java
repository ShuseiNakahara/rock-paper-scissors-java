import java.util.Scanner;

public class Game {
    
    Scanner scanner;
    boolean endGame;
    Participant participant;
    Participant secondParticipant;

    public Game(Scanner sc) {
        this.scanner = sc;
        this.endGame = false;
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        this.participant = new Participant("Spock", sc1);
        this.secondParticipant = new Participant("Kirk", sc2);
    }

    public void start() {
        while (!this.endGame) {
            GameRound gameRound = new GameRound(this.participant, this.secondParticipant);
            gameRound.start();
            this.checkEndCondition();
        }
    }

    public void checkEndCondition() {
        System.out.print("Continue game y/n: ");
        String answer = this.scanner.next();

        if (answer.equals("y")) {
            GameRound gameRound = new GameRound(this.participant, this.secondParticipant);
            gameRound.start();
        } else {
            System.out.print(String.format("Game ended, %s has %d, ", this.participant.getName(), this.participant.getPoints()));
            System.out.println(String.format("and %s has %d", this.secondParticipant.getName(), this.secondParticipant.getPoints()));
            this.determineWinner();
            this.endGame = true;
        }
    }

    public void determineWinner() {
        String resultString = "It's a Draw";
        if (this.participant.getPoints() > this.secondParticipant.getPoints()) {
            resultString = String.format("Winner is %s", this.participant.getName());
        } else if (this.participant.getPoints() < this.secondParticipant.getPoints()) {
            resultString = String.format("Winner is %s", this.secondParticipant.getName());
        }
        System.err.println(resultString);
    }
}
