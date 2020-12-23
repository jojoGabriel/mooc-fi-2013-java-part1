
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int y = Integer.parseInt(reader.next());
        
        System.out.println("");
        System.out.println("Division: " + x + " / " + y + " = " + ((double) x / y));
        }
}
