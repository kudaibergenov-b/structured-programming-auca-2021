public class Problem09 {
    public static void main(String[] args) {

        System.out.println("i             m(i)");
        System.out.println("———————————————————— ");

        for (int i = 1; i <= 901; i += 100) {
            double mi = mFromI(i);
            if (i < 100) {
                System.out.printf("%d             %.4f%n", i, mi);
            } else {
                System.out.printf("%d           %.4f%n", i, mi);
            }
        }

    }
    private static double mFromI(double j) {
        double insideBrackets = 0;
        for (int i = 0, power = 1; i < j; ++i, ++power) {
            insideBrackets += (Math.pow(-1, power + 1)) / (2 * power - 1);
        }
        return 4 * insideBrackets;
    }
}
