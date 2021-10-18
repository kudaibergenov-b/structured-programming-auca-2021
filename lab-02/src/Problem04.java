import java.util.Scanner;

public class Problem04 {
    public static final double CENTIMETERS_PER_INCH = 2.54;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Length in inches? ");
        double inches = inp.nextDouble();

        double centimeters = CENTIMETERS_PER_INCH * inches;

        System.out.printf("%f in. = %.2f cm. %n", inches, centimeters);
    }
}
