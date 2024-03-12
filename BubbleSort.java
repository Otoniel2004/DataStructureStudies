import java.util.Scanner;

class BubbleSort {

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
        int i = 0;
        boolean x;
        do {
            x = false;
            for ( int j = length - 1; j > i; j-- ) {
                if ( array[j-1] > array[j] ) {
                    swap( array, j-1, j );
                    x = true;
                }
            }
            i++;
        } while ( x && i < length );
    
    }

}

