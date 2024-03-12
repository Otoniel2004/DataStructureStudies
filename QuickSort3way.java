import java.util.Scanner;

public class QuickSort3way {
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

    public static void swap( int[] array, int p1, int p2 ) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public static void sort( int[] array ) {
        quickSort3( array, 0, array.length - 1 );
    }

    public static void quickSort3( int[] array, int start, int end ) {
        if ( start < end ) {
            int min = start;
            int max = end;
            int i = start + 1;
            int v = array[start];
            while ( i <= max ) {
                if ( array[i] < v ) {
                    swap( array, min++, i++ );
                } else if ( array[i] > v ) {
                    swap( array, i, max-- );
                } else {
                    i++;
            }
        }
            quickSort3( array, start, min - 1 );
            quickSort3( array, max + 1, end );
        }
    }
        
}
