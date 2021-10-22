import java.util.Scanner;

public class Problem09 {
    public static final int DAYS_IN_A_YEAR = 365;
    public static final int MINUTES_IN_A_DAY = 1440;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = inp.nextInt();

        int years = minutes / (MINUTES_IN_A_DAY * DAYS_IN_A_YEAR);

        int days = ((minutes / MINUTES_IN_A_DAY) % DAYS_IN_A_YEAR);

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
    }
}
