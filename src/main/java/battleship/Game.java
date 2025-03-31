package main.java.battleship;

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
        Ship destroyer = new Ship(2);
        Ship submarine = new Ship(3);
        Ship cruiser = new Ship(3);
        Ship battleship = new Ship(4);
        Ship carrier = new Ship(5);
        // må kunne komme inn i board og plassere disse
        // board har logikk for å plassere skip
        // kan tvinge brukeren til å sette dem ut i en viss rekkefølge
        // kan også hardkode dem inn
    }

    public void bombCoordinates(int x, int y) {
        this.firedShipsBoard.setCoordinate(x, y, bomb);
        // hvis alle koordinatene til et skip er bombet, er skipet sunket
    }

    public static void main(String[] args) {
        Game gyatt = new Game();
        gyatt.bombCoordinates(5, 5);
        System.out.println(gyatt.firedShipsBoard);
        Ship destroyer = new Ship(2);
        System.out.println("\n");
        gyatt.shipBoard.setShip(0, 0, destroyer, false);
        System.out.println(gyatt.shipBoard);
        System.out.println("\n");
        Ship submarine = new Ship(3);
        gyatt.shipBoard.setShip(2, 0, submarine, false);
        System.out.println(gyatt.shipBoard);
    }
}
