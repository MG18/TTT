

public class Board {
    String[][] field = new String[3][3];


    public Board () {
        this.field = new String[3][3];

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

    public String getField(int number) {
        int i = number / 3;
        int j = number % 3;
        return field[i][j];
    }


    public boolean checkWin(){

        if(field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[0][0].equals("X") && field[0][1].equals("X") && field[0][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[1][0].equals("X") && field[1][1].equals("X") && field[1][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[2][0].equals("X") && field[2][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[0][0].equals("X") && field[1][1].equals("X") && field[2][2].equals("X")) {
            System.out.println("X wins!");
            return true;
        }

        if(field[0][2].equals("X") && field[1][1].equals("X") && field[2][0].equals("X")) {
            System.out.println("X wins!");
            return true;
        }


        if(field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[0][0].equals("O") && field[0][1].equals("O") && field[0][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[1][0].equals("O") && field[1][1].equals("O") && field[1][2].equals("o")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[2][0].equals("O") && field[2][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[0][0].equals("O") && field[1][1].equals("O") && field[2][2].equals("O")) {
            System.out.println("O wins!");
            return true;
        }

        if(field[0][2].equals("O") && field[1][1].equals("O") && field[2][0].equals("O")) {
            System.out.println("O wins!");
            return true;
        }
        return false;
    }

    public boolean checkDraw(){
        boolean flag = false;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if("".equals(field[i][j].trim()) || field[i][j] == null) {
                    flag = true;
                }
            }
        }
        if(!checkWin() && !flag){
            return true;
        }
        return false;
    }


}
