import java.util.Scanner;
import java.util.ArrayList;

public class Main {
                
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int[] gradeDistribution = new int[6];
        
        System.out.println("Type exam scores, -1 completes:");
        readScores(lukija, scores);
        
        System.out.println("Grade distribution:");
        gradeDistribution(scores, gradeDistribution);
    
        
    }
    
    public static void readScores(Scanner reader, ArrayList<Integer> scores) {
        
        int score = 0;

        while (true) {
            score = Integer.parseInt(reader.nextLine());
            if (score == -1) {
                break;
            }
            
            scores.add(score);
        }
    }
    
    public static void gradeDistribution(ArrayList<Integer> scores, int[] gradeDist) {
        
        if (scores.size() <= 0) {
            return;
        }
        
        int accepted = 0;
        int validScores = 0;
        
        for (Integer score : scores) {
            if (score < 0) {
                // do nothing
            } else if (score >= 0 && score <= 29) {
                gradeDist[0]++;
                // accepted++;
                validScores++;
            } else if (score >= 30 && score <= 34) {
                gradeDist[1]++;
                accepted++;
                validScores++;
            } else if (score >= 35 && score <= 39) {
                gradeDist[2]++;
                accepted++;
                validScores++;
            } else if (score >= 40 && score <= 44) {
                gradeDist[3]++;
                accepted++;
                validScores++;
            } else if (score >= 45 && score <= 49) {
                gradeDist[4]++;
                accepted++;
                validScores++;
            } else if (score >= 50 && score <= 60) {
                gradeDist[5]++;
                accepted++;
                validScores++;
            } else {
                // do nothing
            }
        }
        
        for (int i = 5; i >= 0; i--) {
            System.out.print("" + (i) + ": ");
            for (int j = 0; j < gradeDist[i]; j++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("Acceptance percentage: " + 
                (100 * (double) accepted / validScores));
    }
    
    
}
