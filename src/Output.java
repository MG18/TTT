public class Output {
    Board board;

    public Output(Board board) {
        this.board = board;
    }

    public void drawBoard() {
        System.out.println("_____________");
        System.out.println("| " + board.getField(0) + " | " + board.getField(1) + " | " + board.getField(2) + " |");
        System.out.println("_____________");
        System.out.println("| " + board.getField(3) + " | " + board.getField(4) + " | " + board.getField(5) + " |");
        System.out.println("_____________");
        System.out.println("| " + board.getField(6) + " | " + board.getField(7) + " | " + board.getField(8) + " |");
        System.out.println("_____________");
    }

    public void outputWin(boolean win, boolean isGerman) {
        if (win && isGerman) {
            System.out.println("Du gewinnst!");
        }
        if(win && !isGerman){
            System.out.println("You win!");
        }
    }
    public void outputDraw(boolean draw, boolean isGerman) {
        if (draw && isGerman) {
            System.out.println("Unentschieden!");
        }
        if(draw && !isGerman){
            System.out.println("Draw!");
        }
    }
    public void outputNextMove(boolean isGerman) {
        if (isGerman) {
            System.out.println("Nächster spieler ist an der Reihe.");
        }
        else {
            System.out.println("Next players Move.");
        }
    }
    public void outputWrongInput(boolean numberInput, boolean isGerman) {
        if (!numberInput && isGerman) {
            System.out.println("Gebe eine Zahl zwischen 1-9 ein. Oder de, en um die Sprache zu wechseln");
        }
        if(!numberInput && !isGerman){
            System.out.println("Enter a number between 1-9. Or de, en to change language.");
        }
    }

}
