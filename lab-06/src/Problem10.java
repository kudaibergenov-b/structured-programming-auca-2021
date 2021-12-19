public class Problem10 {
    public static void main(String[] args) {

        System.out.println("i         m(i)");
        System.out.println("——————————————————");

        for (int i = 1; i <= 20; ++i) {
            double mi = mFromI(i);
            if (i < 10) {
                System.out.printf("%d         %.4f%n", i, mi);
            } else {
                System.out.printf("%d        %.4f%n", i, mi);
            }
        }
    }
    private static double mFromI(int i) {
        double r = 0;
        for (int j = 0, a = 1; j < i; ++j, ++a) {
            r += (double) a / (a + 1);
        }
        return r;
    }
}
