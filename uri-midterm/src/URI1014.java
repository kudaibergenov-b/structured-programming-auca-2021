import java.util.Scanner;

public class URI1014 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        double b = inp.nextDouble();

        double average = a / b;

        System.out.printf("%.3f km/l" , average);
    }
}
