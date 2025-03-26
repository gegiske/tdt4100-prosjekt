package main.java;

public class Game {
    // bombing skjer her
    // bomber kan være 0-er
    // alle X-ene til et skip må være truffet for at det skal synke
    String bomb;
    Board shipBoard;
    Board firedShipsBoard;

    public Game() {
        bomb = "O";
        shipBoard = new Board();
        firedShipsBoard = new Board();
        Ship ship1 = new Ship(2, false);
        Ship ship2 = new Ship(3, false);
        Ship ship3 = new Ship(4, false);
        Ship ship4 = new Ship(5, false);
        // må kunne komme inn i board og plassere disse
        // board har logikk for å plassere skip
        // kan tvinge brukeren til å sette dem ut i en viss rekkefølge
        // kan også hardkode dem inn
    }

    public void bombCoordinates(int x, int y) {
        this.firedShipsBoard.setCoordinate(x, y, bomb);
    }

    public static void main(String[] args) {
        Game gyatt = new Game();
        gyatt.bombCoordinates(5, 5);
        System.out.println(gyatt.firedShipsBoard);
    }
}
