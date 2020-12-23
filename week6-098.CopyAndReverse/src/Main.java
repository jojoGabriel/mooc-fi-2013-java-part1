import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);
        int[] reversed = reverseCopy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println("reversed: " + Arrays.toString(reversed));

    }
    
    public static int[] copy(int[] array) {
        
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array) {
        
        int[] copied = new int[array.length];
        for (int i = array.length -1; i >= 0; i--) {
            copied[(array.length - 1) - i] = array[i];
        }
        return copied;
    }
    
}
