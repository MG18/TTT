import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private String currentInput;

    public Input() {
        scanner = new Scanner(System.in);
    }
    public void getUserInput() {
        currentInput = scanner.nextLine();
    }

    public String getCurrentInput() {
        return currentInput;
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
