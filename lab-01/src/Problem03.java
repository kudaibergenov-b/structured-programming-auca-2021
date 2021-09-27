import java.util.*;

public class Problem03 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");

        Scanner inp = new Scanner(System.in);
        String userName = inp.nextLine();
        System.out.println("Hello, " + userName+ "!");
    }
}
