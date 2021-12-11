import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a = inp.nextInt();
        if (isPalindrome(reverse(a))) {
            System.out.println(reverse(a) + " is palindrome");
        } else {
            System.out.println(reverse(a) + " is not palindrome");
        }

    }

    public static boolean isPalindrome(int b) {
        return reverse(b) == b;
    }

    public static int reverse(int r) {
        int rev = 0;
        while (r != 0) {
            int n = r % 10;
            rev = rev * 10 + n;
            r /= 10;
        }
        return rev;
    }
}
