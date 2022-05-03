import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        System.out.println(Greeting.scanner("Welcome, "));
    }
    public static String scanner(String s) {
        Scanner scannerInstance  = new Scanner(System.in);
        return s + scannerInstance.nextLine();
    }
}