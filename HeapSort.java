import java.util.Scanner;

class HeapSort {
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
        int n = array.length - 1;
        for ( int k = n/2; k >= 1; k-- ) {
            sink( array, k, n );
        }
        while ( n > 1 ) {
            swap( array, 1, n-- );
            sink( array, 1, n );
        }
    }

    //Bottom-Up Reheapify 15 12
    /* 
    private static void swim( int[] array, int k ) {
        while ( k > 1 && array[k/2] < array[k] ) {
        swap( array, k/2, k );
        k = k / 2;
        }
        }
    */
    
    private static void sink( int[] array, int k, int n ) {
        while ( 2*k <= n ) {
            int j = 2*k;
            if ( j < n && array[j] < array[j+1] ) {
                j++;
            }
            if ( array[k] >= array[j] ) {
                break;
            }
            swap( array, k, j );
            k = j;
        }
    }
}
