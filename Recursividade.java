import java.util.Scanner;

public class Recursividade {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.printf("a: ");
        int a = Integer.parseInt(scan.nextLine());

        System.out.printf("b: ");
        int b = Integer.parseInt(scan.nextLine());

        System.out.printf("%d ", soma(a, b));
        System.out.printf("%d ", sub(a, b));
        System.out.printf("%d ", mult(a, b));
        System.out.printf("%d ", div(a, b));

        scan.close();
    }   

    public static int soma (int a, int b) {

        if (b == 0) return a;
        else if (b > 0) {
            return soma(a, b - 1) + 1;
        }

        return a;
    }

    public static int sub (int a, int b) {

        if (b == 0) return a;
        else if (b > 0) {
            return soma(a, b - 1) - 1;
        }

        return a;
    }

    public static int mult (int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else {
            return mult(a - 1, b) + b;
        }
    }

    public static int div (int a, int b) {
        if (a < b) {
            return 0;
        } else {
            return div (a - 1, b) + 1;
        }
    }
}
