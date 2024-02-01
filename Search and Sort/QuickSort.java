 public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};
        Quick(arr, 0, arr.length-1);
        for(int i : arr) System.out.print(i + " ");
    }

    static void Quick(int arr[], int l, int h) {
        if(l < h) {
            int p = parth(arr, l, h);

            Quick(arr, l, p-1);
            Quick(arr, p+1, h);
        }
    }

    static int parth(int arr[], int l, int h) {
        int p = arr[h];

        int i = l;
        int j = h;

        int t;

        while(i < j) {
            while(arr[i] < p && i < h) i++;
            while(arr[j] >= p && j > l) j--;

            if(i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        t = arr[i];
        arr[i] = arr[h];
        arr[h] = t;

        return i;
    }

    static int partl(int arr[], int l, int h) {
        int i = l;
        int j = h;

        int p = arr[l]; 

        int t;

        while(i < j) {
            while(arr[i] <= p && i < h) i++;
            while(arr[j] > p && j > l) j--;

            if(i < j) {
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        t = arr[j];
        arr[j] = arr[l];
        arr[l] = t;

        return j;
    }
}
