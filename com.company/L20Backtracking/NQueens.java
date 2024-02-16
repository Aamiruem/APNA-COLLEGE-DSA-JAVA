
// import java.util.ArrayList;
// import java.util.List;

// public class NQueens {

//     // Check if placing a queen at the specified position is safe
//     public static boolean isSafe(int row, int col, char board[][]) {
//         // Check horizontal
//         for (int j = 0; j < board.length; j++) {
//             if (board[row][j] == 'Q') {
//                 return false;
//             }
//         }

//         // Check vertical
//         for (int i = 0; i < board.length; i++) {
//             if (board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         // Check upper left diagonal
//         int r = row;
//         for (int c = col; c >= 0 && r >= 0; c--, r--) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         // Check upper right diagonal
//         r = row;
//         for (int c = col; c < board.length && r >= 0; r--, c++) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         // Check lower left diagonal
//         r = row;
//         for (int c = col; c >= 0 && r < board.length; r++, c--) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         // Check lower right diagonal
//         for (int c = col; c < board.length && r < board.length; c++, r++) {
//             if (board[r][c] == 'Q') {
//                 return false;
//             }
//         }

//         return true;
//     }

//     // Save the current board configuration to the list of all boards
//     public static void saveBoard(char board[][], List<List<String>> allBoards) {
//         List<String> newBoard = new ArrayList<>();

//         for (int i = 0; i < board.length; i++) {
//             StringBuilder row = new StringBuilder();
//             for (int j = 0; j < board.length; j++) {
//                 row.append(board[i][j]);
//             }
//             newBoard.add(row.toString());
//         }

//         allBoards.add(newBoard);
//     }

//     // Helper function to recursively find all solutions
//     public static void helper(char board[][], List<List<String>> allBoards, int col) {
//         if (col == board.length) {
//             saveBoard(board, allBoards);
//             return;
//         }

//         for (int row = 0; row < board.length; row++) {
//             if (isSafe(row, col, board)) {
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col + 1);
//                 board[row][col] = 'x'; // Backtrack
//             }
//         }
//     }

//     // Solve the N-Queens problem and return a list of all solutions
//     public static List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char board[][] = new char[n][n];

//         // Initialize the board with 'x'
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = 'x';
//             }
//         }

//         helper(board, allBoards, 0);

//         return allBoards;
//     }

//     public static void main(String[] args) {
//         int n = 4; // You can change the value of n to find solutions for different board sizes
//         List<List<String>> solutions = solveNQueens(n);

//         // Print the solutions
//         for (List<String> solution : solutions) {
//             for (String row : solution) {
//                 System.out.println(row + " ");
//             }
//             System.out.println();
//         }
//     }
// }

















// import java.util.ArrayList;
// import java.util.List;
// import java.util.*;

// public class NQueens{
//     public static boolean isSafe(int row, int col, char board[][]){
//         //horizontal
//         for(int j = 0; j<board.length; j++){
//             if(board[row][j]== 'Q'){
//                 return false;
//             }
//         }
//         //vertical
//         for(int i = 0; i<board.length; i++){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }
//         //upper left
//         int r = row;
//         for(int c = col; c>=0 && r>=0; c--, r--){
//             if(board[r][c]== 'Q'){
//                 return false;
//             }
//         }
//         //upper right
//         r = row;
//         for(int c = col; c<board.length && r>=0; r--, c++){
//             if(board[r][c]== 'Q'){
//                 return false;
//             }
//         }
//         //lower left
//         r = row;
//         for(int c = col; c>=0 && r<board.length; r++, c--){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         //lower right
//         for(int c = col; c<board.length && r<board.length; c++, r++){
//             if(board[r][c] == 'Q'){
//                 return false;
//             }
//         }
//         return true;
//     }
//     /**
//      * @param board
//      * @param allBoards
//      */
//     public static void saveBoard(char board[][], List<List<String>> allBoards){
//         String row = " ";
//         List<String> newBoard = new ArrayList<>();

//         for(int i = 0; i < board.length; i++){
//             row = "";
//             for(int j = 0; j < board.length; j++){
//                 if(board[j][i] == 'Q'){
//                     row += 'Q';
//                 } else{
//                     row += 'x';
//                 }
//                 newBoard.add(row);
//             }
//             allBoards.add(newBoard);
//         }
//         public static void helper(char board[][], ListL<List<String>>allBoards, int col){
//             if(col == board.length){
//                 saveBoard(board, allBoards);
//                 return;
//             }
//             for(int row = 0; row<board.length; row++){
//                 if(isSafe(row, col, board)){
//                     board[row][col] = 'Q';
//                     helper(board, allBoards, col+1);
//                     board[row][col] = 'x';
//                 }
//             }
//         }
//         public static List<List<String>>solveNQueens(int n){
//             List<List<String>> allBoards = new ArrayList<>();
//             char board[][] = new char[n][n];
//             helper(board, allBoards, 0);
//             return allBoards;
//         }
//     }
// }









import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static boolean isSafe(int row, int col, char board[][]) {
        // horizontal
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        // vertical
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // upper right
        r = row;
        for (int c = col; c < board.length && r >= 0; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoard(char board[][], List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                row.append(board[i][j]);
            }
            newBoard.add(row.toString());
        }
        allBoards.add(newBoard);
    }

    public static void helper(char board[][], List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = 'x';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        int n = 4; // Example: solve N-Queens for N=4
        List<List<String>> result = solveNQueens(n);
        System.out.print(result);
    }
}
