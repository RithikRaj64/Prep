import java.util.Arrays;

public class InterpolationSearch {
    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 7, 9, 11, 55, 586, 15283};

        System.out.println("Value found at index : " + Inter(arr, 7));
    }

    static int Inter(int arr[], int src) {
        Arrays.sort(arr);

        int l = 0;
        int h = arr.length - 1;
 
        int p;

        while(l < h) {
            p = l + ((src - arr[l]) / (arr[h] - arr[l])) * (h - l);

            if(arr[p] == src) return p;

            if(arr[p] < src) l = p+1;
            else h = p-1;
        }

        if(l == h && arr[l] == src) return l; 

        return -1;
    }
}
