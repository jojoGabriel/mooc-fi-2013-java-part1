import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        String reverse = "";
        int l = text.length() - 1;
        for (int i = l; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        if (reverse.equals(text)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
