import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double x = inp.nextDouble();
        double y = inp.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("1Q");
        }
        if (x > 0 && y < 0) {
            System.out.println("4Q");
        }
        if (x < 0 && y > 0) {
            System.out.println("2Q");
        }
        if (x < 0 && y < 0) {
            System.out.println("3Q");
        }
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        if (x == 0 && y > 0 || x == 0 && y < 0) {
            System.out.println("Eixo Y");
        }
        if (y == 0 && x > 0 || y == 0 && x < 0) {
            System.out.println("Eixo X");
        }
    }
}
