import java.util.Scanner;

public class URI1094 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();
        int x;
        String name;
        int total = 0;
        int cTotal = 0;
        int rTotal = 0;
        int sTotal = 0;
        double cTotalPercent = 0;
        double rTotalPercent = 0;
        double sTotalPercent = 0;

        for (int i = 1; i <= N; ++i) {
            x = inp.nextInt();
            name = inp.next();
            total += x;
            if (name.equals("C")) {
                cTotal += x;
            } else if (name.equals("R")) {
                rTotal += x;
            } else if (name.equals("S")) {
                sTotal += x;
            }

            cTotalPercent = (double) (cTotal * 100) / total;
            rTotalPercent = (double) (rTotal * 100) / total;
            sTotalPercent = (double) (sTotal * 100) / total;
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + cTotal);
        System.out.println("Total de ratos: " + rTotal);
        System.out.println("Total de sapos: " + sTotal);
        System.out.printf("Percentual de coelhos: %.2f%n", cTotalPercent);
        System.out.printf("Percentual de ratos: %.2f%n", rTotalPercent);
        System.out.printf("Percentual de sapos: %.2f%n", sTotalPercent);
    }
}
