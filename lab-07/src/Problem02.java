import java.util.Scanner;

public class Problem02 {
    static Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {

        while (true) {
            int year = readNumber("Year: ", "Incorrect number of year", 1, 100000);

            int month = readNumber("Month: ", "Incorrect number of month", 1, 12);

            int days = getNumberOfDays(year, month);

            System.out.println("Number od days: " + days);
        }
    }
    static int readNumber(String msg, String errorMsg, int beg, int end) {
        System.out.print(msg);
        if (!inp.hasNext()) {
            System.exit(0);
        }
        int res = inp.nextInt();
        if(res < beg || end < res) {
            System.out.println(errorMsg + res);
            System.exit(1);
        }
        return res;
    }
    static int getNumberOfDays(int year, int month) {
       int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       int res = days[month - 1];
       if (isLeapYear(year) && month == 2) {
           ++res;
       }
       return res;
    }

    static boolean isLeapYear(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }
}
