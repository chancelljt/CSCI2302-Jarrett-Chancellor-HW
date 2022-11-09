package Project;
import java.util.Scanner;

public class TicTacToeGame {
   public static void main(String[] args) {
    final int Board_Size = 3;
      String[][] board = new String[Board_Size][Board_Size];
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
            board[i][j] = " ";
         }
      }

      Scanner userInput = new Scanner(System.in);
      System.out.println("Let's start the game TIC TAC TOE.");
      System.out.print("Enter the name of Player1: ");
      String Player1 = userInput.nextLine();
      System.out.print("Enter the name of Player2: ");
      String Player2 = userInput.nextLine();

      boolean P1 = true;
      boolean gameEnded = false;
      
      while (!gameEnded) {
         printBoard(board);

         if (P1) {
            System.out.println(Player1 + "'s Turn (X): ");
         } 
        else {
            System.out.println(Player2 + "'s Turn (O): ");
         }

         String c = " ";
         if (P1) {
            c = "X";
         } else {
            c = "O";
         }

        int rowId = 0;
        int columnId = 0;
        
        while(true){
            System.out.print("Enter a row number (0, 1, or 2): ");
            rowId = userInput.nextInt();
            System.out.print("Enter a column number (0, 1, or 2): ");
            columnId = userInput.nextInt();

            if (rowId < 0 || columnId < 0 || rowId > 2 || columnId > 2) {
            System.out.println("This position is off the bounds of the board! Try again.");
            } else if (board[rowId][columnId] != " ") {
            System.out.println("Someone has already made a move at this position! Try again.");
            } else {
            break;
            }

        }

        board[rowId][columnId] = c;
         if (playerHasWon(board) == "X") {
            System.out.println(Player1 + " has won!");
            gameEnded = true;
         } else if (playerHasWon(board) == "O") {
            System.out.println(Player2 + " has won!");
            gameEnded = true;
         } 
         else {
            if (boardIsFull(board)) {
               System.out.println("It's a tie!");
               gameEnded = true;
            } 
            else{
               P1 = !P1;
            }
         }
      }
      printBoard(board);
      userInput.close();
   }

   public static void printBoard(String[][] board) {
      for (int i = 0; i < board.length; i++) {
        System.out.println("-------------");
         for (int j = 0; j < board.length; j++) {
            System.out.printf("| %s ", board[i][j]);
         }
         System.out.println("|");
      }
      System.out.println("-------------");
   }

   public static String playerHasWon(String[][] board) {
      for (int i = 0; i < board.length; i++) {
         if (board[i][0] == board[i][1] && 
             board[i][1] == board[i][2] && 
             board[i][0] != " ") {
            return board[i][0];
         }
      }

      for (int j = 0; j < board.length; j++) {
         if (board[0][j] == board[1][j] && 
             board[1][j] == board[2][j] && 
             board[0][j] != " ") {
            return board[0][j];
         }
      }

      if (board[0][0] == board[1][1] && 
          board[1][1] == board[2][2] && 
          board[0][0] != " ") {
         return board[0][0];
      }

      if (board[2][0] == board[1][1] && 
          board[1][1] == board[0][2] && 
          board[2][0] != " ") {
         return board[2][0];
      }
      return " ";
   }

   public static boolean boardIsFull(String[][] board) {
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board.length; j++) {
            if (board[i][j] == " ") {
               return false;
            }
         }
      }
      return true;
   }
}