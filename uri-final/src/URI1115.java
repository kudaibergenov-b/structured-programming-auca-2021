import java.util.Scanner;

public class URI1115 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int x;
        int y;

        while ((x = inp.nextInt()) != 0 && (y = inp.nextInt()) != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
        }
    }
}
