package rockscissorspaper;

import rockscissorspaper.players.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Match {

    /**
     * esta clase tiene que ejecutar tantas rondas segun la siguiente condicion
     * p1Score <= 3 o p2Score <= 3
     */
    ArrayList<Player> players;
    private ArrayList<Round> rounds;
    private List<Integer> score;
    private int numberOfRounds;

    public Match(ArrayList players) {
        this.score = Arrays.asList(0, 0);
        this.numberOfRounds = 1;
        this.rounds = new ArrayList<>();
        this.players = players;
        executeInitialRound(score, numberOfRounds, players);
    }

    private void executeInitialRound(List score, int numberOfRounds, List players) {
        Round round = new Round(score, numberOfRounds, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void executeRounds(List score) {
        Round round = new Round(score, numberOfRounds, players);
        updateRoundNumber(round);
        checkScore(round);
    }

    private void checkScore(Round round) {
        score = round.returnScoreInfo();
        if( score.get(0) < 3 && score.get(1) < 3 ){
            executeRounds(score);
        } else{
            announceWinner();
        }
    }

    private void announceWinner() {
        String winner = "";
        if(score.get(0) == 3) {
            winner = "Player1 which is a " + players.get(0);
        }
        if(score.get(1) == 3) {
            winner = "Player1 which is a " + players.get(1);
        }
        System.out.println("# " + winner + " WON THE GAME! CONGRATULATIONS!!!!!!!!\n" +
                "#=====================================================");
    }

    private void updateRoundNumber(Round round) {
        rounds.add(round);
        this.numberOfRounds++;
    }
}