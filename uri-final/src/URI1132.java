import java.util.Scanner;

public class URI1132 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int sum = 0;

        if (a > b) {
            for (int i = a; i >= b; --i) {
                if (i % 13 != 0) {
                   sum += i;
                }
            }
        } else if (a < b) {
            for (int j = a; j <= b; ++j) {
                if (j % 13 != 0) {
                    sum += j;
                }
            }
        }
        System.out.println(sum);
    }
}
