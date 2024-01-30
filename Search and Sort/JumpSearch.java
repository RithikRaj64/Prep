import java.util.Arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Value found at index : " + Jump(arr, 30));
    }

    static int Jump(int arr[], int src) {
        Arrays.sort(arr);

        int n = arr.length;

        int k = (int) Math.sqrt(arr.length);

        int l = 0;
        int h = k;

        while(l<n) {
            if(src == arr[l]) return l;

            if(h >= n) {
                l++;
                while(l<n) {
                    if(arr[l] == src) return l;
                    l++;
                }
                if(l == n) return -1;
            }


            if(src == arr[h]) return h;

            if(src < arr[h]) {
                while(l < h) {
                    l++;
                    if(arr[l] == src)  return l;
                }
            }

            l = h+1;
            h = l+k;
        }

        return -1;
    }
}