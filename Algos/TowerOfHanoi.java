package Algos;

public class TowerOfHanoi {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = 3;
        System.out.print((int)Math.pow(2, n) - 1);
    }
}
