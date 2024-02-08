package Backtracking;

import java.util.*;

public class SubsetSum {

    static HashSet<List<Integer>> set;
    static boolean flag = true;

    public static void main(String[] args) {
        int ar[] = {1, 5, 2, 3, 11, 15};

        int n = ar.length;

        int sum = 200;

        List<Integer> li = new ArrayList<Integer>();

        set = new HashSet<List<Integer>>();

        subset(0, n, ar, li, sum);

        if(flag) {
            System.out.println("No subsets found with the sum of " + sum);
            return;
        }

        for(List<Integer> l : set) {
            System.out.print("[");

            for(int i=0; i<l.size()-1; i++) System.out.print(l.get(i)+ ", ");

            System.out.println(l.get(l.size() - 1) + "]");
        }
    }

    static void subset(int x, int n, int ar[], List<Integer> li, int sum) {
        if(sum == 0) {
            flag = false;
            set.add(new ArrayList<>(li));
        }

        if(x == n) return;

        subset(x + 1, n, ar, li, sum);

        if(ar[x] <= sum) {
            li.add(ar[x]);

            subset(x + 1, n, ar, li, (sum - ar[x]));

            li.remove(li.size() - 1);
        }
    }
}