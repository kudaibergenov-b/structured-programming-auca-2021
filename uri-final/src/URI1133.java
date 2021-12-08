import java.util.Scanner;

public class URI1133 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();

        if (a > b) {
            for (int i = b + 1; i < a; ++i) {
                if (i % 5 == 2 || i % 5 == 3) {
                    System.out.println(i);
                }
            }
        } else if (a < b) {
            for (int j = a + 1; j < b; ++j) {
                if (j % 5 == 2 || j % 5 == 3) {
                    System.out.println(j);
                }
            }
        }
    }
}
