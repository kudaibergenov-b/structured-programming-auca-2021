import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a;
        double sum = 0;
        int n = 0;

        while (n != 2) {
            a = inp.nextDouble();
            if (a >= 0 && a <= 10) {
                sum += a;
                n += 1;
            } else {
                System.out.println("nota invalida");
            }
        }
        double average = sum / n;

        System.out.printf("media = %.2f%n", average);
    }
}
