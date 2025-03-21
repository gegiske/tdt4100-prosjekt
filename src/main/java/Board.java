package main.java;

public class Board {
    String[][] board = new String[10][10];
    // gjøre [10][10] dynamisk?

    public Board() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = null;
            }
        }
    }

    public boolean validateShip(Ship ship) {
        if (ship.length > board.length) {
            throw new IllegalArgumentException("Ship can't be longer than board");
        }
        return true;
    }

    public void addShip(int startx, int starty, Ship ship) {
        validateShip(ship);
        int stopx = board.length;
        int stopy = board.length;
        if (!ship.isVertical) {
            stopx = startx + 1;
            stopy = starty + ship.length;
        } else {
            stopy = starty + 1;
            stopx = startx + ship.length;
        }
        for (int x = startx; x < stopx; x++) {
            for (int y = starty; y < stopy; y++) {
                if (board[x][y] == ship.shipLetter) {
                    throw new IllegalArgumentException("Can't put a ship on top of another ship");
                }
                this.board[x][y] = ship.shipLetter;
            }
        }
    }

    public String[][] getBoard() {
        return board;
    }

    public String toString() {
        String[] boardRows = new String[this.board.length];
        for (int i = 0; i < board.length; i++) {
            String currentRow = "";
            for (int j = 0; j < board.length; j++) {
                String rowValue = board[i][j];
                if (rowValue == null) {
                    rowValue = " ";
                }
                currentRow += "[" + rowValue + "]";
            }
            boardRows[i] = currentRow;
        }

        String strBoard = String.join("\n", boardRows);
        return strBoard;
    }

    public static void main(String[] args) {
        Board board = new Board();
        Ship frigatt = new Ship(5, true);
        board.addShip(1, 2, frigatt);
        System.out.println(board);
        System.out.println("\n");
        Ship sjarken = new Ship(3, false);
        board.addShip(9, 2, sjarken);
        System.out.println(board);
        // Ship båt = new Ship(3, false);
        // board.addShip(3, 1, båt);
        // Ship jolla = new Ship(-3, false);
        // board.addShip(3, 1, jolla);
    }
}
