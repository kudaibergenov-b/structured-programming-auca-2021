import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        int celsius = inp.nextInt();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
