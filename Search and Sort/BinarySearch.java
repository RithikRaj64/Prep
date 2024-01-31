public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {8, 6, 7, 2, 4, 1, 3, 5};

        System.out.print(Binary(arr, 0, arr.length-1, 2));
    }

    static int Binary(int arr[], int l, int h, int x) {
        if(h>=l) {
            int mid = l + (h-l) / 2;

            if(arr[mid] == x) return mid;

            else if(x < arr[mid]) return Binary(arr, l, mid-1, x);

            else return Binary(arr, mid+1, h, x);
        }

        return -1;
    }
}
