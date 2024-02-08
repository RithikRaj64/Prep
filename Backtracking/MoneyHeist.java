public class MoneyHeist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n; i++) ar[i] = s.nextInt();
                
        System.out.print(rob(ar, n-1));
    }
    
    static int rob(int ar[], int x) {
        if(x < 0) return 0;
        
        if(x == 0) return ar[0];
        
        return Math.max((ar[x] + rob(ar, x-2)), rob(ar, x-1));
    }
}   