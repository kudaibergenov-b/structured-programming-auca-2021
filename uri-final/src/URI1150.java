import java.util.Scanner;

public class URI1150 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x = inp.nextInt();
        int z = inp.nextInt();
        int counter = 0;
        int sum = 0;

        while (z <= x) {
            z = inp.nextInt();
        }
        while (sum <= z) {
            sum += x;
            ++x;
            ++counter;
        }
        System.out.println(counter);

    }
}

