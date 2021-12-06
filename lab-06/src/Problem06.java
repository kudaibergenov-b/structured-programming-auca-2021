import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        System.out.println(sumDigits(n));

    }
    public static int sumDigits(long n) {
        int s = 0;
        while (n != 0) {
            s += Math.abs(n % 10);
            n /= 10;
        }
        return s;
    }
}
