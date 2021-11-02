import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Year? ");
        int year = inp.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
}
