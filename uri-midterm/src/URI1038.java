import java.util.Scanner;

public class URI1038 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int y = inp.nextInt();

        if (x == 1) {
            System.out.printf("Total: R$ %.2f%n", 4.00 * y);
        }
        if (x == 2) {
            System.out.printf("Total: R$ %.2f%n", 4.50 * y);
        }
        if (x == 3) {
            System.out.printf("Total: R$ %.2f%n", 5.00 * y);
        }
        if (x == 4) {
            System.out.printf("Total: R$ %.2f%n", 2.00 * y);
        }
        if (x == 5) {
            System.out.printf("Total: R$ %.2f%n", 1.50 * y);
        }
    }
}
