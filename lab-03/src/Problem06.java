import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int d = b * b - 4 * a * c;

        double R = (- b + Math.pow(d , 0.5)) / (2 * a);
        double r = (- b - Math.pow(d , 0.5)) / (2 * a);

        if (d > 0) {
            System.out.println("The equation has two roots " + R + " and " + r);
        } else if (d == 0) {
            System.out.println("The equation has one root " + R);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
