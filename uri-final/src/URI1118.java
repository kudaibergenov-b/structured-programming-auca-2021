import java.util.Scanner;

public class URI1118 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a;
        double sum = 0;
        int n = 0;
        int x = 0;
        while (x != 2) {
            while (n != 2) {
                a = inp.nextDouble();
                if (a >= 0 && a <= 10) {
                    sum += a;
                    n += 1;
                } else {
                    System.out.println("nota invalida");
                }
            }
            double average = sum / 2;
            n -= 2;
            sum = 0;

            System.out.printf("media = %.2f%n", average);
            System.out.println("novo calculo (1-sim 2-nao)");

            x = inp.nextInt();

            while (x < 1 || x > 2) {
                System.out.println("novo calculo (1-sim 2-nao)");
                x = inp.nextInt();
            }
        }
    }
}

