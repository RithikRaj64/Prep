package Algos;

import java.util.ArrayList;

public class PoliceThief {
    public static void main(String[] args) {
        char arr[] = {'T', 'T', 'P', 'P', 'T', 'P'};

        // boolean chk[] = new boolean[arr.length];

        // for(int i=0; i<arr.length; i++) if(arr[i] == 'T') chk[i] = true;

        // int k = 2;
        // int c = 0;
        // boolean flag;

        // for(int i=0; i<chk.length; i++) {
        //     if(arr[i] == 'P') {
        //         flag = true;

        //         for(int j=1; j<=k && (i-j)>=0; j++) {
        //             if(chk[i-j]) {
        //                 chk[i-j] = false;
        //                 c++;
        //                 flag = false;
        //                 break;
        //             }
        //         }

        //         for(int j=1; j<=k && flag && (i+j)<arr.length; j++) {
        //             if(chk[i+j]) {
        //                 chk[i+j] = false;
        //                 c++;
        //                 break;
        //             }
        //         }
        //     }
        // }

        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> t = new ArrayList<Integer>();

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'P') p.add(i);
            else t.add(i);
        }

        int k=2;
        int c=0;

        int i=0, j=0;

        while(i<p.size() && j<t.size()) {
            if(Math.abs(p.get(i) - t.get(j)) <= k) {
                i++;
                j++;
                c++;
            }

            else if(p.get(i) < t.get(j)) {
                i++;
            }

            else {
                j++;
            }
        }

        System.out.print(c);
    }
}
