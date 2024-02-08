package DP;

public class MinEditDist {
    public static void main(String[] args) {
        String a = "TCA";
        String b = "CAT";

        Tabulation(a, b);
    }

    static void Memoization(String a, String b) {
        
    }

    static void Tabulation(String a, String b) {
        int m = a.length();
        int n = b.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<=n; i++) {
            for(int j=0; j<=m; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                else if(j == 0) {
                    dp[i][j] = i;
                }
                else {
                    if(a.charAt(j-1) == b.charAt(i-1)) {
                        dp[i][j] = dp[i-1][j-1];
                    }
                    else {
                        dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1])) + 1;
                    }
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
