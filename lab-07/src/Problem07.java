import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int numbers = 0;
        int sum = 0;
        int a;
        int above = 0;
        int below = 0;

        int [] scores = new int[100];
        while (numbers < scores.length) {
            a = inp.nextInt();
            if (a >= 0) {
                scores[numbers] = a;
                sum += scores[numbers];
                ++numbers;
            } else {
                break;
            }
        }
        double average = (double) sum / numbers;
        for (int i = 0; i < numbers; ++i) {
            if (scores[i] >= average) {
                ++above;
            } else {
                ++below;
            }
        }
        System.out.println("The average is: " + average);
        System.out.println("Scores above or equal to the average are: " + above);
        System.out.println("Scores below average are: " + below);
    }
}
