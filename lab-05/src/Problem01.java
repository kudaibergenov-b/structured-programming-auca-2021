import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double sum = 0;
        int nGrades = 0;

        int grade = inp.nextInt();
        while (grade != 0) {
            sum += grade;
            ++nGrades;
            grade = inp.nextInt();
        }

        if (nGrades != 0) {
            System.out.printf("The arithmetic mean is %.1f%n", sum / nGrades);
        } else {
            System.out.println("Nothing to calculate");
        }
    }
}
