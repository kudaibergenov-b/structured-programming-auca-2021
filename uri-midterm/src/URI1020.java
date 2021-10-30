import java.util.Scanner;

public class URI1020 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
         int d = inp.nextInt();

         int years = d / 365;

         int months = (d - years * 365) / 30;

         int days = d - (years * 365 + months * 30);

         System.out.println(years + " ano(s)");
         System.out.println(months + " mes(es)");
         System.out.println(days + " dia(s)");
    }
}
