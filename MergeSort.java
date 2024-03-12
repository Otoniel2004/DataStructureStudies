import java.util.Scanner;

class MergeSort {
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
        int length = array.length;
        int[] tempMS = new int[length];
        topDown( array, 0, length - 1, tempMS );

        }
    private static void topDown( int[] array, int start, int end, int[] tempMS ) {
        int middle;
            if ( start < end ) {
                middle = ( start + end ) / 2;
                topDown( array, start, middle, tempMS ); // esquerda
                topDown( array, middle + 1, end, tempMS ); // direita
                merge( array, start, middle, end, tempMS ); // intercalação
            }
        }
    private static void merge( int[] array, int start, int middle, int end, int[] tempMS ) {
        int i = start;
        int j = middle + 1;
        for ( int k = start; k <= end; k++ ) {
            tempMS[k] = array[k];
        }
        for ( int k = start; k <= end; k++ ) {
            if ( i > middle ) {
                array[k] = tempMS[j++];
            } else if ( j > end ) {
                array[k] = tempMS[i++];
            } else if ( tempMS[j] < tempMS[i] ) {
                array[k] = tempMS[j++];
            } else {
                array[k] = tempMS[i++];
            }
        }
    }
    //Merge Sort Bottom-Up
    /*
    private static void bottomUp( int[] array, int start, int end, int[] tempMS ) {
        for ( int m = 1; m <= end; m *= 2 ) {
            for ( int i = start; i <= end - m; i += 2*m ) {
                merge( array, i, i+m-1, Math.min( i+2*m-1, end ), tempMS );
            }
        }
    }
    */   
}
