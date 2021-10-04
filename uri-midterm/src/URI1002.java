import java.util.Scanner;

public class URI1002 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double PI = 3.14159;

        double R = inp.nextDouble();

        double a = (PI * R * R);

        System.out.printf("A=%.4f%n", a);
    }
}
