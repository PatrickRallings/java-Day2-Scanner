import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        System.out.println("Let's write a story about a superhero. \nWho is the hero of our story?");
        String superheroName = Superhero.scanner();
        System.out.println("What is their superpower?");
        String superheroPower = Superhero.scanner();
        System.out.println("There once was a superhero named "+superheroName+", who had the power of "+superheroPower+". \nAs they grew older, "+superheroName+" saw that the world needed them. \n"+superheroName+" used their ability to "+superheroPower+" to save the world.");
    }
    public static String scanner() {
        Scanner scannerInstance  = new Scanner(System.in);
        return scannerInstance.nextLine();
    }
}
