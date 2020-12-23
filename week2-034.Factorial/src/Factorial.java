import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int i = 1;
        
        if (n==0) {
            System.out.println("Factorial is " + 1);
        } else if (n > 0) {
            
            int factorial = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial is " + factorial);                
        }
        

    }
}
