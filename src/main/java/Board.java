package main.java;

public class Board {
    String[][] board = new String[5][5];

    public Board() {
        // tom konstruktør?
    }

    public boolean validateShip() {
        // sjekke at den ikke er lengre enn brettets lengde
        // kan ikke sette to båter oppå hverandre, alle felt der man vil sette en båt må
        // være tomme
        return true;
    }

    public void addShip(int startx, int starty, Ship ship) {
        // må modifisere this.board
        // kan iterere gjennom lengden, starte loopen med startkoor, replace karakteren
        // som er der med X
        // ut ifra om den er vertikal, ønsker vi ikke å endre y-koor, det skal alltid
        // være samme
        // hvis den er horisontal, skal x-koordinatet være det samme
        for (int x = startx; x < board.length; x++) {
            for (int y = starty; y < board.length; y++) {
                if (x == startx) {
                    this.board[x][y] = "X";
                }

                System.out.println(x);
                System.out.println(y);

                // modifisere board, og print, se hvordan det ser ut
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public String toString() {
        String[] boardRows = new String[5];
        for (int i = 0; i < board.length; i++) {
            String currentRow = "";
            for (int j = 0; j < board.length; j++) {
                board[i][j] = " ";
                currentRow += "[" + board[i][j] + "]";
            }
            boardRows[i] = currentRow;
        }
        String strBoard = String.join("\n", boardRows);
        return strBoard;
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board);
        Ship frigatt = new Ship(2, true);
        board.addShip(1, 2, frigatt);
        System.out.println(board);
    }
}
