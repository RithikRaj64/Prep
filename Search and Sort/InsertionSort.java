public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};

        int n = arr.length;

        int k;
        
        for(int i=1; i<n; i++) {
            k = arr[i];

            int j;
            for(j=i-1; j>=0 && arr[j] > k; j--) arr[j+1] = arr[j];

            arr[j+1] = k;
        }

        for(int i : arr) System.out.print(i + " ");
    }
}
