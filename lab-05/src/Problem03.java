import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rnd = new Random();

        System.out.print("Number of tests? ");
        int nTests = inp.nextInt();

        int i = 0;
        while (i < nTests) {
            System.out.println(-50 + rnd.nextInt(101));
            ++i;
        }
    }
}
