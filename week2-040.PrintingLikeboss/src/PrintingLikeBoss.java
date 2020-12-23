public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 1;
        while (i <= amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 1;
        while (i <= amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 1;
        int maxWidth = 1;
        
        while (i <= height) {
            maxWidth += 2;
            i++;
        } 
        
        i = 1;
        int width = 1;
        while (i <= height) {
            printWhitespaces(height - i);
            printStars(width);
            i++;
            width += 2;
        }
        
        i = 1;
        while (i <= 2) {
            printWhitespaces(((maxWidth -3) / 2) - 1);
            printStars(3);
            i++;
        }
                
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        // printStars(5);
        // System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
