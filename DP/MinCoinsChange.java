package DP;

import java.util.Arrays;

public class MinCoinsChange {
    public static void main(String[] args) {
        int coins[] = {9, 6, 5, 1};
        int n = 3;
        int v = 25;

        int dp[] = new int[v+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        int x;
        for(int i=1; i<=v; i++) {
            for(int j=0; j<n; j++) {
                if(i >= coins[j]) {
                    x = dp[i - coins[j]];

                    if(x != Integer.MAX_VALUE && (x + 1) < dp[i]) dp[i] = x+1;
                }
            }
        }

        if(dp[v] == Integer.MAX_VALUE) {
            System.out.println("Change cannot be given!!");
            return;
        }

        System.out.println("Minimum number of coins is " + dp[v]);
    }
}
