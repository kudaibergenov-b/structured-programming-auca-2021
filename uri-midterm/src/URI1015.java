import java.util.Scanner;

import static java.lang.Math.sqrt;

public class URI1015 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         double x1 = inp.nextDouble();
         double y1 = inp.nextDouble();
         double x2 = inp.nextDouble();
         double y2 = inp.nextDouble();

         double D = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
         double d = sqrt(D);

         System.out.printf("%.4f%n" , d);
    }
}
