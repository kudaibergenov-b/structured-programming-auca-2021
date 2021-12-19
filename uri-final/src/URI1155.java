public class URI1155 {
    public static void main(String[] args) {
        double sum = 0;

        for (double i = 1; i <= 100; ++i) {
            sum += (1 / i);
        }
        System.out.printf("%.2f%n", sum);
    }
}
