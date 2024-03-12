import java.util.Scanner;

class ShellSort {
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
        int h = 1;
        int length = array.length;
        while ( h < length / 3 ) {
            h = 3 * h + 1; // 1, 4, 13, 40...
        }
        while ( h >= 1 ) {
            for ( int i = h; i < length; i++ ){
            int j = i;
            while ( j >= h && array[j-h] > array[j] ) {
                swap( array, j-h, j );
                j = j - h;
            }
        }
        h = h / 3;
        }
    }
}
