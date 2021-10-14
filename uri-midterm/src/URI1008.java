import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();

        int b = inp.nextInt();

        double c = inp.nextDouble();

        double s = b * c;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f%n", s);
    }
}
