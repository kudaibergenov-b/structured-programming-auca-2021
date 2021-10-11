import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the radius and the length of a cylinder: ");
        double radius = inp.nextDouble();
        double length = inp.nextDouble();

        double pi = 22.0 / 7;

        double area = radius * radius * pi;

        double volume = area * length;

        System.out.printf("The area is %.4f%n ", area);
        System.out.printf("The volume is %.1f%n ", volume);

    }
}
