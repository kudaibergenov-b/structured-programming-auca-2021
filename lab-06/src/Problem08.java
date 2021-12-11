import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int nOfLines = inp.nextInt();

        displayPattern(nOfLines);
    }

    public static void displayPattern(int n) {
        int a = n - 1;

        for (int s = 1; s <= n; ++s) {
            for (int i = 0; i < a; ++i) {
                System.out.print("  ");
            }

            for (int j = s; j > 0; --j) {
                System.out.print(j + " ");
            }

            --a;
            System.out.println();
        }
    }
}
