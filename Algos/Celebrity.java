package Algos;

// A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N
// people, find if there is a celebrity in the party or not.
// A square NXN matrix M[][] is used to represent people at the party such that if an element of row i and column
// j is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
// Note: Follow 0 based indexing.
// Follow Up: Can you optimize it to O(N)

import java.util.*;

public class Celebrity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        int arr[][] = new int[n][n];
        
        for(int i=0; i<n; i++) for(int j=0; j<n; j++) arr[i][j] = s.nextInt();
        
        boolean chk[] = new boolean[n];
        Arrays.fill(chk, false);
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j == i) continue;
                if(arr[j][i] == 0) {
                    chk[i] = true;
                    break;
                }
            }
        }
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j == i) continue;
                if(arr[i][j] == 1) {
                    chk[i] = true;
                    break;
                }
            }
        }
        
        int c = 0;
        
        for(int i=0; i<n; i++) if(!chk[i]) c++;
        
        if(c == 0 || c == n)  System.out.println(-1);
        else {
            for(int i=0; i<n; i++) {
                if(!chk[i]) {
                    System.out.print(i);
                }
            }
        }

        s.close();
    }
}
