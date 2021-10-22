import java.util.Scanner;

public class Problem08 {
    public static final double KILOGRAMS_PER_POUND = 0.454;

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double pounds = inp.nextDouble();

        double kilograms = pounds * KILOGRAMS_PER_POUND;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
