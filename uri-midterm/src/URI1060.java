import java.util.Scanner;

public class URI1060 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int nPositives = 0;

        for (int i = 0; i < 6; ++i) {
            double x = inp.nextDouble();
            if (x > 0) {
                nPositives++;
            }
        }
        System.out.println(nPositives + " valores positivos");
    }
}
