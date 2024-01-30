import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};
        ms(arr, 0, arr.length-1);
        for(int i : arr) System.out.print(i + " ");
    }

    static void ms(int arr[], int l, int h) {
        if(l >= h) return;

        int m = (l+h)/2;

        ms(arr, l, m);
        ms(arr, m+1, h);

        merge(arr, l, m, h);
    }

    static void merge(int arr[], int l, int m, int h) {
        int i = l;
        int j = m+1;

        ArrayList<Integer> li = new ArrayList<Integer>();

        while(i<=m && j<=h) {
            if(arr[i] <= arr[j]) {
                li.add(arr[i]);
                i++;
            }
            else {
                li.add(arr[j]);
                j++;
            }
        }

        while(i<=m) li.add(arr[i++]);
        while(j<=h) li.add(arr[j++]);

        for(i=l; i<=h; i++) arr[i] = li.get(i-l);
    }
}
