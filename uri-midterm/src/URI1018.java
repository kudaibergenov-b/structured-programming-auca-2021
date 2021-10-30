import java.util.Scanner;

public class URI1018 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();

        int hundred = N / 100;
        int fifty = (N - hundred * 100) / 50;
        int twenty = (N - (hundred * 100 + fifty * 50)) / 20;
        int ten = (N - (hundred * 100 + fifty * 50 + twenty * 20)) / 10;
        int five = (N - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10)) / 5;
        int two = (N - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5)) / 2;
        int one = N - (hundred * 100 + fifty * 50 + twenty * 20 + ten * 10 + five * 5 + two * 2);

        System.out.println(N);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}
