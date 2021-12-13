import java.util.Scanner;

public class URI1173 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int[] n = new int[10];

        int first = inp.nextInt();
        int multiplier = 1;

        for (int i = 0; i < n.length; ++i) {
            if (i != 0) {
                n[i] = first * 2 * multiplier;
                multiplier *= 2;
            } else {
                n[i] = first;
            }
        }
        for (int i = 0; i < n.length; ++i) {
            System.out.printf("N [%d] = %d%n", i, n[i]);
        }
    }
}
