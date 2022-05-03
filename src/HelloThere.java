import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        System.out.println("Hey, how's your day going? Good | Bad");
        System.out.println(secondPrompt(HelloThere.scanner()));
        HelloThere.scanner();
        System.out.println("Well it's been nice chatting, let's talk again soon!");
    }
    public static String scanner() {
        Scanner scannerInstance = new Scanner(System.in);
        return scannerInstance.nextLine();
    }
    public static String secondPrompt(String s) {
        if (s.equalsIgnoreCase("good")) {
            return "I'm happy to hear that, please tell me more!";
        }
        if (s.equalsIgnoreCase("bad")) {
            return "Oh dang, I'm sorry, what's wrong?";
        }
        else {
           return "Hmm, please tell me more...";
        }
    }

}
