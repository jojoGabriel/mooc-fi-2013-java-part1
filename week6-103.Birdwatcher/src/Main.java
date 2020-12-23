
import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter

        Scanner reader = new Scanner(System.in);
        BirdDB birds = new BirdDB();
        
        while (true) {
            System.out.print("?");
            String command = reader.nextLine();
            if (command.equals("Add")) {
                add(reader, birds);
                
            } else if (command.equals("Observation")) {
                observe(reader, birds);
                 
            } else if (command.equals("Statistics")) {
                stats(birds);
                
            } else if (command.equals("Show")) {
                show(reader, birds);
                
            } else if (command.equals("Quit")) {
                return;
            }
        }
    }
    
    public static void add(Scanner reader, BirdDB birds) {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        birds.add(name, latinName);
    }
    
    public static void observe(Scanner reader, BirdDB birds) {
        System.out.print("What was observed:? ");
        String name = reader.nextLine();
        birds.observed(name);
    }
    
    public static void stats(BirdDB birds) {
        birds.stats();
    }
    
    public static void show(Scanner reader, BirdDB birds) {
        System.out.print("What? ");
        String name = reader.nextLine();
        birds.show(name);
    }

}
