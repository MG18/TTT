public class Logic {
    private Board board;

    public Logic(Board board) {
        this.board = board;
    }


    public static void main(String[] args) {
        String[][] s = new String[2][2];
        s[1][1] = "";
        //System.out.println(s[0][0]);
        System.out.println(s[1][1]);


    }

    public boolean checkFieldFree(){
        return true;
    }
}
