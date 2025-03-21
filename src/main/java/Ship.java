package main.java;

public class Ship {

    String ship;
    String shipLetter;
    int length;
    boolean isVertical;

    public Ship(int length, boolean isVertical) {
        ship = "";
        validateLength(length);
        if (length >= 5) {
            shipLetter = "F";
        } else {
            shipLetter = "X";
        }
        // kan endre på X utifra hvor langt skipet er, feks F hvis det er 5 langt for
        // fregatt
        this.length = length;
        this.isVertical = isVertical;
    }

    public void validateLength(int length) {
        if (length < 1) {
            throw new IllegalArgumentException("Ship must be at least 1 long");
        }
    }

    public String getShip() {
        return shipLetter + length + isVertical;
        // TODO: sjekk om denne stemmer
    }

    public String toString() {
        for (int i = 0; i < length; i++) {
            ship += shipLetter;
        }
        return ship;
    }

    public static void main(String[] args) {
        Ship ship = new Ship(3, false);
        System.out.println(ship);
    }
}
