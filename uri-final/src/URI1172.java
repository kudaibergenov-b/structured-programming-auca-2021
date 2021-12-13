import java.util.Scanner;

public class URI1172 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] a = new int[10];

        for (int i = 0; i < a.length; ++i) {
            a[i] = inp.nextInt();
        }
        for (int i = 0; i < a.length; ++i) {
            if (a[i] <= 0) {
                a[i] = 1;
            }
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.printf("X[%d] = %d%n", i, a[i]);
        }
    }
}
