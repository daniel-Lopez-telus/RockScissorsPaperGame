package rockscissorspaper.players;

import rockscissorspaper.players.Player;

public class ComputerPlayer extends Player {

    /**
     * esta clase debe de ser capaz de mandar una opcion seleccionada al azar hacia quien?
     * hacia Round
     * con solo ejecutar el metodo chooseAShape() debo retornar una opcion y recibirla en Round
     */

    @Override
    public int chooseAShape() {
        return 0;
    }

    @Override
    public String toString() {
        return "ComputerPlayer";
    }


}
