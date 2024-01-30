public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};

        int n = arr.length;

        int min, t;

        for(int i=0; i<n-1; i++) {
            min = i;

            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[min]) min = j;
            }

            t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }

        for(int x : arr) System.out.print(x + " ");
    }
}
