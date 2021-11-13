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
        int seconds = SECONDS_IN_MINUTE * MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
        int births = seconds / SECONDS_PER_BIRTH;
        int deaths = seconds / SECONDS_PER_DEATH;
        int immigrants = seconds / SECONDS_PER_IMMIGRANT;
        int first = CURRENT_POPULATION + births - deaths + immigrants;
        int second = first + births - deaths + immigrants;
        int third = second + births - deaths + immigrants;
        int fourth = third + births - deaths + immigrants;
        int fifth = fourth + births - deaths + immigrants;
        System.out.println("1st year = " + first);
        System.out.println("2nd year = " + second);
        System.out.println("3rd year = " + third);
        System.out.println("4th year = " + fourth);
        System.out.println("5th year = " + fifth);
    }
}
