import java.util.Scanner;
/**
 * Robert Lightfoot
 * CSCE 111
 * 2 d array example
 * myTicTacToe
 */
public class myTicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Scanner input = new Scanner(System.in);

        //initialize board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }

        System.out.println("Hi, columns are 1, 2, 3 and rows are 1, 2, 3 ");
        System.out.print(" what column do you want? (9 to quit) ");

        int col = input.nextInt() - 1;

        while (col != 8) {
            System.out.print("What row do you want? ");
            int row = input.nextInt() - 1;

            System.out.print("What do you want to play? (x or o) ");
            char play = input.next().charAt(0);

            board[row][col] = play;

            // print out board
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }

            System.out.print(" what column do you want? (9 to quit) ");
            col = input.nextInt() - 1;
        }
        System.out.println("Thanks for playing.");
        
    }
    
}