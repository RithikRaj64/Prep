import java.util.Scanner;

class ArrayReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};

        int t;
        for (int i=0; i<n/2; i++) {
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }

        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}