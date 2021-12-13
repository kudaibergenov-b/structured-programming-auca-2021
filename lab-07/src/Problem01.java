import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rnd = new Random();

        System.out.print("N: ");
        int n = inp.nextInt();

        int[] counters = new int[11];

        for (int i = 0; i < n; ++i) {
            int cube1 = 1 + rnd.nextInt(6);
            int cube2 = 1 + rnd.nextInt(6);
            ++counters[cube1 + cube2 - 2];
        }

        for (int i = 0, sum = 2; i < counters.length; ++i, ++sum) {
            System.out.printf("%.2d: %d%n", sum, counters[i]);
        }
    }
}

