import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         double PI = 3.14159;

         double R = inp.nextDouble();

         double a = (4/3.0) * PI * R * R * R;

         System.out.printf("VOLUME = %.3f%n", a);
    }
}
