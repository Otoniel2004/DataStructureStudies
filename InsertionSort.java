import java.util.Scanner;

class InsertionSort {
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
        for ( int i = 1; i < length; i++ ) {
            int j = i;
            while ( j > 0 && array[j-1] > array[j] ) {
                swap( array, j-1, j );
                j--;
            }
        }
    }

}
