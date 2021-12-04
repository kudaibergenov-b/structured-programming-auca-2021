import java.util.Scanner;

public class URI1113 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a;
        int b;

        while ((a = inp.nextInt()) != (b = inp.nextInt())) {
            if (a > b) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
    }
}
