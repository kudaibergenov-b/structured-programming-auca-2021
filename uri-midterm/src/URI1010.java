import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        double c = inp.nextDouble();

        int A = inp.nextInt();
        int B = inp.nextInt();
        double C = inp.nextDouble();

        double value = b * c + B * C;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", value);
    }
}
