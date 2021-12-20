import java.util.Random;

public class Problem04 {
    static final int NUM_SHUFFLE_MOVES = 5;
    static Random rnd = new Random();
    static int [][] gameBoard = new int[4][4];
    static int emptyRow;
    static int emptyCol;
    public static void main(String[] args) {
        initBoard();
        shuffleBoard();
        printBoard();
    }

    private static void shuffleBoard() {
        int nMoves = 0;
        while (nMoves < NUM_SHUFFLE_MOVES) {
            int dir = rnd.nextInt(4);
            int dr = 0;
            int dc = 0;
            switch (dir) {
                case 0:
                    dr = -1;
                    break;
                case 1:
                    dc = 1;
                    break;
                case 2:
                    dr = 1;
                    break;
                case 3:
                    dc = -1;
                    break;
            }
            if (0 <= emptyRow + dr && emptyRow + dr < 4 && 0 <= emptyCol + dc && emptyCol + dc < 4) {
                gameBoard[emptyRow][emptyCol] = gameBoard[emptyRow + dr][emptyCol + dc];
                emptyRow += dr;
                emptyCol += dc;
                gameBoard[emptyRow][emptyCol] = 16;
                ++nMoves;
            }
        }
    }

    private static void initBoard() {
        int curNumber = 1;
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 4; ++col) {
                gameBoard [row][col] = curNumber;
                ++curNumber;
            }
        }
        emptyRow = 3;
        emptyCol = 3;
    }

    private static void printBoard() {
        for (int row = 0; row < 4; ++row) {
            for (int col = 0; col < 4; ++col) {
                if (gameBoard [row][col] != 16) {
                    System.out.printf("%3d", gameBoard[row][col]);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
