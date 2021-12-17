import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = inp.nextInt();

        int[] scores = new int[n];
        int best;

        System.out.print("Enter " + n + " scores: ");
        for (int i = 0; i < scores.length; ++i) {
            scores[i] = inp.nextInt();
        }
        best = maxOfArray(scores);
        for (int i = 0; i < scores.length; ++i) {
            if (scores[i] >= best - 10) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");
            } else if (scores[i] >= best - 20) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= best - 30) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");
            } else if (scores[i] >= best - 40) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is F");
            }
        }

    }
    private static int maxOfArray(int [] a) {
        int max = 0;
        for (int i = 0; i < a.length; ++i) {
           if (a[i] > max) {
               max = a[i];
           }
        }
        return max;
    }
}
