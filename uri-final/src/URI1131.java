import java.util.Scanner;

public class URI1131 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int matches = 0;
        int victoryOfInt = 0;
        int victoryOfGre = 0;
        int draws = 0;
        int x = 0;

        while (x != 2) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            matches += 1;
            System.out.println("Novo grenal (1-sim 2-nao)");

            x = inp.nextInt();
            if (a > b) {
                victoryOfInt += 1;
            } else if (a < b) {
                victoryOfGre += 1;
            } else {
                draws += 1;
            }
        }
        System.out.println(matches + " grenais");
        System.out.println("Inter:" + victoryOfInt);
        System.out.println("Gremio:" + victoryOfGre);
        System.out.println("Empates:" + draws);
        if (victoryOfInt > victoryOfGre) {
            System.out.println("Inter venceu mais");
        } else if (victoryOfInt < victoryOfGre) {
            System.out.println("Gremio venceu mais");
        } else {
            System.out.println("Não houve vencedor");
        }

    }
}
