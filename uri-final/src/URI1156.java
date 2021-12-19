public class URI1156 {
    public static void main(String[] args) {

        double a = 1;
        double b = 1;
        double sum = 0;

        for (int i = 0; a <= 39; ++i) {
            sum += a / b;
            a += 2;
            b *= 2;
        }
        System.out.printf("%.2f%n", sum);
    }
}