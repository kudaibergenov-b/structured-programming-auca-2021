import java.util.Scanner;

public class URI1041 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double x = inp.nextDouble();
        double y = inp.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        if (x == 0 && y > 0 || x == 0 && y < 0) {
            System.out.println("Eixo Y");
        }
        if (y == 0 && x > 0 || y == 0 && x < 0) {
            System.out.println("Eixo Y");
        }
    }
}
