public class Logic {



    public static void main(String[] args) {
        Logic logic = new Logic();
        logic.startGame();


    }

    public void startGame(){
        Board board = new Board();
        Output output = new Output(board);
        Input input = new Input();
        boolean draw = false;
        boolean win = false;
        boolean isGerman = false;
        boolean isNumber = false;
        String symbol = "X";
        while(!draw || !win){
            output.outputNextMove(isGerman);
            input.getUserInput();
            isNumber = input.checkUserInputNumber(input.getCurrentInput());
            isGerman = input.checkUserInputGerman(input.getCurrentInput());
            if(input.checkUserInputNumber(input.getCurrentInput())){
                isNumber = false;
            }
            if(isNumber){
                board.setSymbol(Integer.parseInt(input.getCurrentInput()), symbol);
            }
            if(!is)
        }
    }

}
