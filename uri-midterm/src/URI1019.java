import java.util.Scanner;

public class URI1019 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int N = inp.nextInt();

        int hours = N / 3600;

        int minutes = (N - hours * 3600) / 60;

        int seconds = N - (hours * 3600 + minutes * 60);

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
