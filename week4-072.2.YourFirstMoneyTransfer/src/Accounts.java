
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account matt = new Account("Matt's account", 1000.00);
        Account mine = new Account("My account", 0);
        
        matt.withdrawal(100);
        mine.deposit(100.00);
        System.out.println(matt);
        System.out.println(mine);
    }

}
