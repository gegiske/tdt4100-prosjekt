package main.java;

public class Ship {
    // lengde på skip kan være 1, 2 eller 3
    // kan være horisontale eller vertikale
    // se på skip som koordinater
    // konstruer med start koordinat og slutt

    String ship;
    int length;
    boolean isVertical;
    // validere lengde? før man kaller skip?

    public Ship(int length, boolean isVertical) {
        ship = "X";
        // kan endre på X utifra hvor langt skipet er, feks F hvis det er 5 langt for fregatt
        this.length = length;
        this.isVertical = isVertical;
    }

    public String getShip() {
        return ship;
    }

    public String toString() {
        String ship = String.valueOf(getShip());
        return ship;
    }

    public static void main(String[] args) {
        
    }
}
