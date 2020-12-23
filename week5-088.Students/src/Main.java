
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String name;
        String studentNumber;
        
        while (true) {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.length() == 0) {
                break;
            }
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
            students.add(new Student(name, studentNumber));
        }

        for (Student s :students) {
            System.out.println(s);
        }
        
        System.out.print("Give search term: ");
        name = reader.nextLine();        
           
        System.out.println("result");
        
        for (Student s: students) {
            if (s.getName().contains(name)) {
                System.out.println(s);
            }
        }
    }
}
