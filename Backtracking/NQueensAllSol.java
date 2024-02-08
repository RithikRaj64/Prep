package Backtracking;

public class NQueensAllSol {
    static int sols = 0;
    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];

        solve(n, board, 0);
        
        if(sols == 0) System.out.println("Solution doesnt exist for the board of size " + n + "x" + n);
    }

    static void solve(int n, int board[][], int col) {
        if(col >= n) {
            print(board);
            return;
        }

        for(int i=0; i<n; i++) {
            if(safe(n, board, i, col)) {
                board[i][col] = 1;

                solve(n, board, col+1);

                board[i][col] = 0;
            }
        }

        return;
    }

    static boolean safe(int n, int board[][], int row, int col) {
        for(int i=0; i<col; i++) if(board[row][i] == 1) return false;
        
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) if(board[i][j] == 1) return false;

        for(int i=row, j=col; i<n && j>=0; i++, j--) if(board[i][j] == 1) return false;

        return true;
    }

    static void print(int board[][]) {
        sols++;

        System.out.println("Solution " + sols + " : ");
        for(int x[] : board) {
            for(int y : x) {
                if(y == 0) System.out.print("_ ");
                else System.out.print("Q ");
            }
            System.out.println();
        }

        System.out.println();
    }
}