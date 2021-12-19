import java.util.Scanner;

public class URI1153 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n ; ++i) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
