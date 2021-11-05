import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();

        int first = a;
        int second = b;
        int third = c;

        if (b < a && b < c) {
            first = b;
        }
        if (c < a && c < b) {
            first = c;
        }
        if (a > b && a < c || a < b && a > c) {
            second = a;
        }
        if (c < a && c > b || c > a && c < b) {
            second = c;
        }
        if (a > c && a > b) {
            third = a;
        }
        if (b > c && b > a)
            third = b;
        System.out.println(first + ", " + second + ", " + third);
    }
}
