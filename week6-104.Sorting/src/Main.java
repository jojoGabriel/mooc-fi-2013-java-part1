import java.util.Arrays;
       
public class Main {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int smallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    
    public static int indexOfTheSmallest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int from) {
        int smallest = Integer.MAX_VALUE;
        int index = -1;
        
        for (int i = from; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;        
    }
    
    public static void sort(int[] array) {
       
       int si = 0;
       
       System.out.println(Arrays.toString(array));
       for (int i = 0; i < array.length; i++) {
           si = indexOfTheSmallestStartingFrom(array, i);
           swap(array, i, si);
           System.out.println(Arrays.toString(array));
       }
    }
    
}
