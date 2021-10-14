import java.util.Scanner;

public class URI1005 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double a = inp.nextDouble();

        double b = inp.nextDouble();

        double c = ((a * 3.5) + (b *7.5)) / 11;

        System.out.printf("MEDIA = %.5f%n",c);
    }
}
