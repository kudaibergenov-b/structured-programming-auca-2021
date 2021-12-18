import java.util.Scanner;

public class URI1134 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a;
        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        while ((a = inp.nextInt()) != 4) {
            if (a == 1) {
                ++alcohol;
            } else if (a == 2) {
                ++gasoline;
            } else if (a == 3) {
                ++diesel;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}
