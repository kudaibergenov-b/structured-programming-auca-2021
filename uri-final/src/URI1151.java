import java.util.Scanner;

public class URI1151 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        int number;
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                number = first;
            } else if (i == 1) {
                number = second;
            } else {
                number = first + second;
                first = second;
                second = number;
            }
            if (i < n - 1) {
                System.out.print(number + " ");
            } else {
                System.out.print(number);
            }
        }
        System.out.print("\n");
    }
}
