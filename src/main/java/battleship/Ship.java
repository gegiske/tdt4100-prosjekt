package main.java.battleship;

public class Ship {

    String ship;
    String shipLetter;
    int length;

    public Ship(int length) {
        ship = "";
        validateLength(length);
        if (length >= 5) {
            shipLetter = "F";
        } else {
            shipLetter = "X";
        }

        this.length = length;
    }

    public void validateLength(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Ship must be at least 1 long");
        }
    }

    public String getShip() {
        return shipLetter + length;
        // TODO: sjekk om denne stemmer
    }

    public String toString() {
        for (int i = 0; i < length; i++) {
            ship += shipLetter;
        }
        return ship;
    }

    public static void main(String[] args) {
        Ship ship = new Ship(3);
        System.out.println(ship);
    }
}
