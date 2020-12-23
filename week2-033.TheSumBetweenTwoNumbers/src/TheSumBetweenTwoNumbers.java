
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:");
        int min = Integer.parseInt(reader.nextLine());
        
        System.out.println("Last:");
        int max = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while (min <= max) {
            sum += min;
            min++;
        }
        System.out.println("The sum is " + sum);
                
        
    }
}
