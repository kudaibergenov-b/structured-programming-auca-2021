import java.util.Scanner;

public class URI1158 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int sum;

        for (int i = 0; i < n; ++i) {
            sum = 0;
            int a = inp.nextInt();
            int b = inp.nextInt();

            for (int j = a, total = 0; total < b; ++j) {
                if (j % 2 != 0) {
                    sum += j;
                    total += 1;
                }
            }
            System.out.println(sum);
        }
    }
}
