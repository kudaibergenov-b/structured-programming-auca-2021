import java.util.Scanner;

public class URI10101 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a;
        int b;

        while ((a = inp.nextInt()) > 0 && (b = inp.nextInt()) > 0) {
            int sum = 0;
            if (a > b) {
                for (int i = b; i <= a; ++i) {
                    sum += i;
                    System.out.print(i + " ");
                }
            } else {
                for (int j = a; j <= b; ++j) {
                    sum += 1;
                    System.out.print(j + " ");
                }
            }
            System.out.println("Sum=" + sum);
        }
    }
}
