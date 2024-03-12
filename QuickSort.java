import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[8];
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("n%d: ", i);
            array[i] = Integer.parseInt(scan.nextLine());
        }

        sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ",array[i]);
        }

        scan.close();
    }

    public static void sort( int[] array ) {
        quickSort( array, 0, array.length - 1 );

    }

    private static void quickSort( int[] array, int start, int end ) {
        if ( start < end ) {
        // particionamento, calcula posição do meio
        int middle = partition( array, start, end );

            quickSort( array, start, middle - 1 ); // esquerda
            quickSort( array, middle + 1, end ); // direita
        }
    }

    private static int partition( int[] array, int start, int end ) {
        int i = start;
        int j = end + 1;
        while ( true ) {
            while ( array[++i] < array[start] ) {
                if ( i == end ) {
                    break;
                }
            }
            while ( array[--j] > array[start] ) {
                if ( j == start ) {
                    break;
                }
            }
            if ( i >= j ) {
                break;
            }
            swap( array, i, j );
        }
            swap( array, start, j );
            return j;
    }

    public static void swap( int[] array, int p1, int p2 ) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }
}