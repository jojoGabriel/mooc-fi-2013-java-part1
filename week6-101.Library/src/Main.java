public class Main {
        // test your program here
    public static void resetArray(int[] table) {
        for ( int i=0; i < table.length; i++ )
            table[i] = 0;
    }

    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };

        for ( int number : values ) {
            System.out.print( number + " " );  // prints 1, 2, 3, 4, 5
        }

        System.out.println();

        resetArray(values);

        for ( int number : values ) {
            System.out.print( number + " " );  // prints 0, 0, 0, 0, 0
        }
    }

}
