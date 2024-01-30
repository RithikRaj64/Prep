public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};

        int n = arr.length;

        int t;

        for(int i=0; i<n-1; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        } 

        for(int i : arr) System.out.print(i + " ");
    }
}
