package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 8;
        int board[][] = new int[n][n];

        if(solve(n, board, 0)) {
            System.out.println("Solution exists");
            for(int x[] : board) {
                for(int y : x) {
                    if(y == 0) System.out.print("_ ");
                    else System.out.print("Q ");
                }
                System.out.println();
            }

            return;
        }

        System.out.println("Solution doesnt exist for the board of size " + n + "x" + n);
    }

    static boolean solve(int n, int board[][], int col) {
        if(col >= n) return true;

        for(int i=0; i<n; i++) {
            if(safe(n, board, i, col)) {
                board[i][col] = 1;

                if(solve(n, board, col+1)) return true;

                board[i][col] = 0;
            }
        }

        return false;
    }

    static boolean safe(int n, int board[][], int row, int col) {
        for(int i=0; i<col; i++) if(board[row][i] == 1) return false;
        
        for(int i=row, j=col; i>=0 && j>=0; i--, j--) if(board[i][j] == 1) return false;

        for(int i=row, j=col; i<n && j>=0; i++, j--) if(board[i][j] == 1) return false;

        return true;
    }
}