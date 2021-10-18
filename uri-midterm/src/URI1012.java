import java.util.Scanner;

public class URI1012 {
    public static final double PI = 3.14159;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();
        double b = inp.nextDouble();
        double c = inp.nextDouble();

        double A = a * c / 2;
        double B = PI * c *c;
        double C = (a + b) / 2 * c;
        double D = b * b;
        double E = a * b;

        System.out.printf("TRIANGULO: %.3f%n", A);
        System.out.printf("CIRCULO: %.3f%n", B);
        System.out.printf("TRAPEZIO: %.3f%n", C);
        System.out.printf("QUADRADO: %.3f%n", D);
        System.out.printf("RETANGULO: %.3f%n", E);
    }
}
