
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name: ");
        String m = reader.nextLine();
        System.out.println("Type your age: ");
        int x = Integer.parseInt(reader.nextLine());
     
        
        System.out.println("Type your name: ");
        String n = reader.nextLine();
        System.out.println("Type your age: ");
        int y = Integer.parseInt(reader.nextLine());
        
        System.out.println(m + " and " + n + " are " + (x + y) + " in total.");
        
    }
}
