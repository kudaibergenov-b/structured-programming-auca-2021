import java.util.Scanner;

public class URI1159 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x;
        int sum;

        while ((x = inp.nextInt()) != 0) {
            sum = 0;
            for (int i = x, even = 0; even < 5; ++i) {
                if (i % 2 == 0) {
                    sum += i;
                    ++even;
                }
            }
            System.out.println(sum);
        }
    }
}
