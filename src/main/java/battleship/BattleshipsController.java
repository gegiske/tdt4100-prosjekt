package main.java.battleship;

public class BattleshipsController {
    private Game game;

    // saveHandler

    public BattleshipsController() {

    }

    public void initialize() {
        game = new Game();
        // Game lager to brett, shipBoard og firedShipsBoard
        game.firedShipsBoard.getBoard();
        game.shipBoard.getBoard();
        Ship destroyer = new Ship(2);
        game.shipBoard.setShip(0, 0, destroyer, false);
    }

}
