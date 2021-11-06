import java.util.Scanner;

public class URI1036 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        double x = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        double X = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);

        if (b *b - 4 * a * c < 0 || 2 * a == 0) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.printf("R1 = %.5f%n", x);
            System.out.printf("R2 = %.5f%n", X);
        }
    }
}
