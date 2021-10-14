import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String name = inp.nextLine();

        double a = inp.nextDouble();

        double b = inp.nextDouble();

        double c = (b * 15) / 100;

        double d = a + c;

        System.out.printf("TOTAL = R$ %.2f%n", d);
    }
}
