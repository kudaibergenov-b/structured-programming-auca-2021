import java.util.Scanner;

public class URI1142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        for (int i = 0, a = 1, b = 2, c = 3; i < n; ++i, a += 4, b += 4, c += 4) {
            System.out.printf("%d %d %d PUM%n", a, b , c);
        }
    }
}
