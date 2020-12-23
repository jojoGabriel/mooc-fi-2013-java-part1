
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        System.out.println("First: ");
        int min = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last: ");
        int max = Integer.parseInt(reader.nextLine());
        
        while (min <= max) {
            System.out.println(min);
            min++;
        }
        
    }
}
