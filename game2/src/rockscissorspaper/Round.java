package rockscissorspaper;

import rockscissorspaper.players.Player;
import rockscissorspaper.shapes.Shape;

import java.util.Arrays;
import java.util.List;

public class Round {

    Shape shapes[];
    private int myRoundNumber;
    private int p1Score;
    private int p2Score;
    private Player player1;
    private Player player2;
    public Round(List score, int numberOfRound, List player){
        this.shapes = new Shape[3];
        this.p1Score = (int) score.get(0);
        this.p2Score = (int) score.get(1);
        this.player1 = (Player) player.get(0);
        this.player2 = (Player) player.get(1);
        this.myRoundNumber = numberOfRound;
        runningRound();
    }

    private void runningRound(){
        int p1option = 0;
        int p2option = 0;
        System.out.println("#YOU ARE PLAYING NOW !!!\n" +
                "#ROUND " + myRoundNumber + ":\n" +
                "#LIVE SCORE: P1 = " + p1Score + " || P2 = " + p2Score +
                "#====================================================");
        System.out.println("# P1 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#\n");
        p1option = player1.chooseAShape();
        System.out.println("# P2 SELECT YOUR WEAPON:\n" +
                "#1. ROCK\n" +
                "#2. SCISSORS\n" +
                "#3. PAPER\n" +
                "#");
        p2option = player2.chooseAShape();
        checkWinnerOfTheRound(p1option, p2option);
    }

    private void checkWinnerOfTheRound(Shape shape1, Shape shape2) {

    }
    private void checkWinnerOfTheRound(int p1option, int p2option){
        System.out.println("##READY . . . ?\n" +
                "#\n" +
                "#\n");
        //reglas del juego
        //player1Shape vs player2Shape
        if(p1option > p2option || ){
            updateScoreGame(1);
        }


        System.out.println("# SCISSORS BEATS PAPER \n" +
                "#\n" +
                "# PLAYER 1 WINS!!!!! P1 HAVE SCORED 1 POINT OUT OF 3.");
    }

    private void updateScoreGame(int assingPoint){
        if(assingPoint == 1){
            p1Score++;
        }
        if(assingPoint == 2){
            p2Score++;
        }
    }

    public List<Integer> returnScoreInfo(){
        List<Integer> myList = Arrays.asList(0, 0);
        myList.add(0, p1Score);
        myList.add(1, p2Score);
        return myList;
    }

    public
}
