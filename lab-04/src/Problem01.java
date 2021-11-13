public class Problem01 {
    public static void main(String[] args) {
        double x = 0;

        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;
        x += 0.1;

        if (Math.abs(x - 1.0) < 1E-10) {
            System.out.println("OK");
            System.out.println(x);
        } else {
            System.out.println("What?!!!");
        }
    }
}
