import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private String input;

    public Input() {
        scanner = new Scanner(System.in);
    }
    public String getUserInput() {
        input = scanner.nextLine();
        return input;
    }
    public boolean checkUserInputNumber(String input) {

        if(input != null && Integer.parseInt(input) <= 9 && Integer.parseInt(input) >= 0){
            return true;
        }
        else {
            return false;
        }

    }

    public boolean checkUserInputGerman(String input) {
        if("de".equalsIgnoreCase(input.trim())) {
            return true;
        }
        else{
            return false;
        }
    }

    public boolean checkUserInputEnglish(String input) {
        if("en".equalsIgnoreCase(input.trim())) {
            return true;
        }
        else{
            return false;
        }
    }
}
