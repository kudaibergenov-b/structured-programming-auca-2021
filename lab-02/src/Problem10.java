import java.util.Scanner;

public class Problem10 {
    public static final int SECONDS_PER_BIRTH = 7;
    public static final int SECONDS_PER_DEATH = 13;
    public static final int SECONDS_PER_IMMIGRANT = 45;
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int HOURS_IN_DAY = 24;
    public static final int DAYS_IN_YEAR = 365;
    public static final int CURRENT_POPULATION = 312032486;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int years = inp.nextInt();

        int seconds = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
        int births = seconds / SECONDS_PER_BIRTH;
        int deaths = seconds / SECONDS_PER_DEATH;
        int immigrants = seconds / SECONDS_PER_IMMIGRANT;
        int increase = births - deaths + immigrants;
        int population = CURRENT_POPULATION + years * increase;

        System.out.println("The population in " + years + " years is " + population);
    }
}

