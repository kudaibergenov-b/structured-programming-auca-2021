import java.util.Scanner;

public class URI1080 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x;

        int position = 0;
        int highest = 0;

        for (int i = 1; i <= 100; ++i) {
            x = inp.nextInt();

            if (highest > x) {
                highest = highest;
                position = position;
            } else {
                highest = x;
                position = i;
            }
        }

        System.out.println(highest);
        System.out.println(position);
    }
}
