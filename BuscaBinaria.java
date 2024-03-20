import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] array =  new int[16];
        int key;

        Scanner scan = new Scanner(System.in);

        
        for (int i = 0; i < array.length; i++) {
            System.out.printf("n%d: ", i);
            array[i] = Integer.parseInt(scan.nextLine());
        }
        
        System.out.printf("Key: ");
        key = Integer.parseInt(scan.nextLine());

        System.out.printf("%d ", search(array, key));

        scan.close();

    }

    public static int search( int[] array, int key ) {
        int n = array.length;
        for ( int i = 0; i < n; i++ ) {
            if ( array[i] == key ) {
                return i;
            }
        }
        return -1;
    }

    /* 

    Busca Binária Iterativa

    public static int search( int[] array, int key ) {
        int start = 0;
        int end = array.length - 1;
        int middle;
        while ( start <= end ) {
            middle = ( start + end ) / 2;
            if ( key == array[middle] ) {
                return middle;
            } else if ( key < array[middle] ) {
                end = middle - 1;
            } else { // key > array[middle]
                start = middle + 1;
            }
        }
        return -1;
    }

    */

    /*

    Busca Binária Recursiva

    public static int search( int[] array, int key ) {
        return searchR( array, key, 0, array.length - 1 );
    }

    private static int searchR( int[] array, int key, int start, int end ) {
        int middle = ( start + end ) / 2;
        if ( start <= end ) {
            if ( key == array[middle] ) {
                return middle;
            } else if ( key < array[middle] ) {
                return searchR( array, key, start, middle - 1 );
            } else { // key > array[middle]
                return searchR( array, key, middle + 1, end );
            }
        } else {
            return -1;
        }
    }
     */
}