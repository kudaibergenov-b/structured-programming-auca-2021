import java.util.Scanner;

public class URI1099 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int a;
        int b;

        for (int i = 1; i <= n; ++i) {
            int odd = 0;
            a = inp.nextInt();
            b = inp.nextInt();
            if (a > b) {
                for (int j = a - 1; j > b; --j ) {
                    if (j % 2 != 0) {
                        odd += j;
                    }
                }
            } else if (a < b) {
                for (int j = a + 1; j < b; ++j) {
                    if (j % 2 != 0) {
                        odd += j;
                    }
                }
            }
            System.out.println(odd);
        }
    }
}
