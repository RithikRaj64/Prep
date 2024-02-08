package Backtracking;

public class NoOfIslands {        
    public static void main(String[] args) {
        int grid[][] = {
            {1, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 1, 1},
            {1, 0, 0, 1}
        };

        System.out.println(numIslands(grid));
    }

    static int numIslands(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;

        int count = 0;

        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                if(grid[i][j] == 1) {
                    count++;
                    util(a, b, i, j, grid);
                }
            }
        }

        return count;
    }

    static void util(int a, int b, int i, int j, int[][] grid) {
        if(i < 0 || j < 0 || i >= a || j >= b || grid[i][j]==0) return;

        if(grid[i][j] == 1) {
            grid[i][j] = 0;

            util(a, b, i+1, j, grid);
            util(a, b, i-1, j, grid);
            util(a, b, i, j+1, grid);
            util(a, b, i, j-1, grid);
        }
    }
}