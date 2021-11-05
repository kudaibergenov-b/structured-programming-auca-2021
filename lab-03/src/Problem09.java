import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int a = inp.nextInt();

        int b = (int) (Math.random() * 3);

        if (a == 0 && b == 0) {
            System.out.println("The computer is scissor. You are scissor too. It is a draw");
        } else if (a == 0 && b == 1) {
            System.out.println("The computer is rock. You are scissor. You lost");
        } else if (a == 0 && b == 2) {
            System.out.println("The computer is paper. You are scissor. You won");
        }
        if (a == 1 && b == 0) {
            System.out.println("The computer is scissor. You are rock. You won");
        } else if (a == 1 && b == 1) {
            System.out.println("The computer is rock. You are rock too. It is a draw");
        } else if (a == 1 && b == 2) {
            System.out.println("The computer is paper. You are rock. You lost");
        }
        if (a == 2 && b == 0) {
            System.out.println("The computer is scissor. You are paper. You lost");
        } else if (a == 2 && b == 1) {
            System.out.println("The computer is rock. You are paper. You won");
        } else if (a == 2 && b == 2) {
            System.out.println("The computer is paper. You are paper too. It is a draw");
        }
    }
}
