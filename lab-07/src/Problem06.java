import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numbers = 0;

        int a;

        int[] occurrence = new int[100];

        System.out.print("Enter the integers between 1 and 100: ");

        while ((a = inp.nextInt()) != 0) {
        occurrence[numbers] = a;
        numbers += 1;
    }
        numberOfOccurrences(occurrence);
    }

    public static void numberOfOccurrences(int[] b) {
        for (int i = 1; i <= 100; ++i) {
            int counter = 0;
            for (int j = 0; j < b.length - 1; ++j) {
                if (b[j] == i) {
                    counter += 1;
                }
            }
            if (counter == 1) {
                System.out.printf("%d occurs %d %s%n", i, counter, "time");
            } else if (counter > 1) {
                System.out.printf("%d occurs %d %s%n", i, counter, "times");
            }
        }
    }
}
