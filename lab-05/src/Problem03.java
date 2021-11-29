import java.util.Random;
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        Random rnd = new Random();

        System.out.print("Number of tests? ");
        int nTests = inp.nextInt();

        int numOfCorrectAnswers = 0;

        for (int i = 1; i <= nTests; ++i) {
            int op1 = -50 + rnd.nextInt(101);
            int op2 = -50 + rnd.nextInt(101);
            System.out.printf("%d + %d = ", op1, op2);
            int userAnswer = inp.nextInt();
            if (op1 + op2 == userAnswer) {
                ++numOfCorrectAnswers;
            }
        }
        System.out.println("Number of correct answers: " + numOfCorrectAnswers);
        System.out.println("Number of incorrect answers: " + (nTests - numOfCorrectAnswers));
    }
}
