import java.util.Scanner;

public class URI1079 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();

        for (int i = 1; i <= N; ++i) {
            double a = inp.nextDouble();
            double b = inp.nextDouble();
            double c = inp.nextDouble();
            double average = (a * 2 + b * 3 + c * 5) / 10;
            System.out.printf("%.1f%n", average);
        }
    }
}
