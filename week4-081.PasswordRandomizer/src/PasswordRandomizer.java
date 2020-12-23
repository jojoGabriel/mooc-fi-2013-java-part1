import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int pwdLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.pwdLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        this.random = new Random();
        String pwd = "";
        
        int i = 1;
        while (i <= this.pwdLength) {
          char c = (char) (this.random.nextInt(26) + 'a'); 
          pwd += c;
          i++;
        }
                
        return pwd;
    }
}
