package rockscissorspaper.players;

import rockscissorspaper.Console;
import rockscissorspaper.players.Player;
import rockscissorspaper.shapes.Shape;

public class HumanPlayer extends Player {

    Shape shapes[];

    public Shape pickAShape() {

    }
    @Override
    public int chooseAShape() {
        int option = Console.getInt("#SELECT AN OPTION: ");
        String option = Console.getString()
        return option;
    }


    @Override
    public String toString() {
        return "HumanPlayer";
    }
}
