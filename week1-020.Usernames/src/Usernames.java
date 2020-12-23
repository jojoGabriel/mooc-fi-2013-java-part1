
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your user name: ");
        String n = reader.nextLine();

        System.out.println("Type your password: ");
        String p = reader.nextLine();

        if ((n.equals("alex") && p.equals("mightyducks")) || (n.equals("emily") && p.equals("cat")))  {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your user name or password is invalid!");
        }
    }
}
