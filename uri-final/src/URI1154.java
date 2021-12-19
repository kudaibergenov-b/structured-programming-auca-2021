import java.util.Scanner;

public class URI1154 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int age;
        int number = 0;
        double sum = 0;

        while (true) {
            age = inp.nextInt();
            if ( age < 0) {
                break;
            } else {
                sum += age;
                ++number;
            }
        }
        System.out.printf("%.2f%n", sum / number);
    }
}
