import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("User coordinate: ");
        int userX = inp.nextInt();

        System.out.print("Coordinate of the 1st point: ");
        int x1 = inp.nextInt();

        System.out.print("Coordinate of the 2nd point: ");
        int x2 = inp.nextInt();

        int d1 = AuMath.abs(userX - x1);

        int d2 = AuMath.abs(userX - x2);

        if (d1 < d2) {
            System.out.println("1st point is closer. The distance is " + d1);
        } else if (d1 > d2) {
            System.out.println("2nd point is closer. The distance is " + d2);
        } else {
            System.out.println("Distance is the same. It is " + d1);
        }
    }
}
