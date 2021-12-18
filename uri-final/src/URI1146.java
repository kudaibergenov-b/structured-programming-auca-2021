import java.util.Scanner;

public class URI1146 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n;

        while ((n = inp.nextInt()) != 0) {
            for (int i = 1; i <= n; ++i) {
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
