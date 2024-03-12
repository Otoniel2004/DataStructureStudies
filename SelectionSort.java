import java.util.Scanner;

public class SelectionSort {
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
            int length = array.length;
                for ( int i = 0; i < length; i++ ) {
                    int min = i;
                for ( int j = i + 1; j < length; j++ ) {
                    if ( array[j] < array[min] ) {
                    min = j;
                }
            }
                swap( array, i, min );
            }
        }
        public static void swap( int[] array, int p1, int p2 ) {
            int temp = array[p1];
            array[p1] = array[p2];
            array[p2] = temp;
        }
            
}
