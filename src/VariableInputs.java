import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        System.out.println("Enter a string of text:");
        String textInput = VariableInputs.scanner();
        System.out.println("Enter an integer:");
        int intInput = Integer.parseInt(VariableInputs.scanner());
        System.out.println("Enter a double:");
        double doubleInput = Double.parseDouble(VariableInputs.scanner());
        System.out.println("Enter a boolean value:");
        boolean booleanInput = Boolean.parseBoolean(VariableInputs.scanner());
        System.out.println("Your string is "+textInput+"\nYour integer is "+intInput+"\nYour double is "+doubleInput+"\nYour boolean is "+booleanInput);

    }
    public static String scanner() {
        Scanner scannerInstance  = new Scanner(System.in);
        return (scannerInstance.nextLine());
    }
}
