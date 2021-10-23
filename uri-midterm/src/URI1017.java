import java.util.Scanner;

public class URI1017 {
    public static final double KM_PER_L = 12;
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int time = inp.nextInt();
        int speed = inp.nextInt();

        double litres = speed * time / KM_PER_L;

        System.out.printf("%.3f%n" , litres);
    }
}
