package Algos;

import java.util.Arrays;

public class SieveOfEratosthenes {
        public int countPrimes(int n) {
            int c = 0;
    
            boolean arr[] = new boolean[n];
    
            Arrays.fill(arr, true);
    
            for(int i=2; i*i<=n; i++) {
                if(arr[i]) {
                    for(int j=i*i; j<n; j+=i) {
                        arr[j] = false;
                    }
                }
            }
    
            for(int i=2; i<n; i++) if(arr[i]) c++;
    
            return c;
        }
}