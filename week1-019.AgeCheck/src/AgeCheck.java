
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("How old are you? ");
        int i = Integer.parseInt(reader.nextLine());
        
        if (i >= 0 && i <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
