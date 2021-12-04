import java.util.Scanner;

public class URI1116 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int x;
        int y;

        for (int i = 1; i <= n; ++i) {
            x = inp.nextInt();
            y = inp.nextInt();
            if (y != 0) {
                double d = (double) x / y;
                System.out.printf("%.1f%n", d);
            } else {
                System.out.println("divisao impossivel");
            }
        }
    }
}
