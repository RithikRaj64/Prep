package Backtracking;

public class NoOfPaths {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;

        System.out.println(paths(0, 0, a, b));
    }

    static int paths(int x, int y, int a, int b) {
        if(x == (a-1) || y == (b-1)) return 1;

        return paths(x+1, y, a, b) + paths(x, y+1, a, b);
    }
}
