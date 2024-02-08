package DP;

import java.util.Arrays;

// Longest Increasing Subsequence
public class LIS {
    public static void main(String[] args) {
        int arr[] = {5, 7, 6, 7, 8};

        int n = arr.length;

        int dp[] = new int[n];
        Arrays.fill(dp, 1);

        for(int i=1; i<n; i++) {
            for(int j=0; j<i; j++) {
                if(arr[i] > arr[j] && dp[i] < (dp[j] + 1)) dp[i] = dp[j] + 1;
            }
        }

        int max = 0;

        for(int x : dp) if(x > max) max = x;

        System.out.println(max);
    }
}