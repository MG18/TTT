import jdk.incubator.vector.VectorOperators;

import java.util.Scanner;

public class Board {
    String[][] field = new String[3][3];
    private String player1;
    private String player2;
    private Scanner scanner;

    public Board (String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = new Scanner(System.in);
    }
    public void setSymbol(int number, String symbol) {
        switch(number){
            case 1: field[0][0] = symbol;
            break;

            case 2: field[0][1] = symbol;
            break;

            case 3: field[0][2] = symbol;
            break;

            case 4: field[1][0] = symbol;
            break;

            case 5: field[1][1] = symbol;
            break;

            case 6: field[1][2] = symbol;
            break;

            case 7: field[2][0] = symbol;
            break;

            case 8: field[2][1] = symbol;
            break;

            case 9: field[2][2] = symbol;
            break;
        }
    }

    public String[][] getField() {
        return field;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }
}
