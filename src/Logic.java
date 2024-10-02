public class Logic {
    private Board board;

    public Logic(Board board) {
        this.board = board;
    }

    public void checkWin(){
        String[][] field = board.getField();

        if(field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }

        if(field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X")) {
            System.out.println("Player " + board.getPlayer1() + " wins!");
        }


        if(field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("o")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[0][0].equals("O") && field[1][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }

        if(field[0][2].equals("O") && field[1][1].equals("O") && field[2][0].equals("O")) {
            System.out.println("Player " + board.getPlayer2() + " wins!");
        }
    }

    public void checkUserInput(String input){
        if(input.equalsIgnoreCase("de")) {
            System.out.println("Deutsch");
        }
        else if(input.equalsIgnoreCase("en")) {
            System.out.println("English");
        }
        else{
            if(input > 9 || input < 0){
                System.out.println("Please enter a number between 0 and 9");
            }
        }


    }

    public boolean checkFieldFree(){
        if()
    }
}
