package Algos;

import java.util.*;

class Sum {
    public List<List<Integer>> threeSum(int[] arr) {
        // Set<List<Integer>> res = new HashSet<List<Integer>>();

        // List<Integer> li;

        // int n = nums.length;

        // for(int i=0; i<n; i++) {
        //     for(int j=(i+1); j<n; j++) {
        //         for(int k=(j+1); k<n; k++) {
        //                 if(nums[i] + nums[j] + nums[k] == 0) {
        //                     li = Arrays.asList(nums[i], nums[j], nums[k]);
        //                     li.sort(null);
        //                     res.add(li);
        //                 }
        //         }
        //     }
        // }

        // return new ArrayList<>(res);

        Arrays.sort(arr);

        List<List<Integer>> li = new ArrayList<>();

        int n = arr.length;

        int j, k, sum;

        for(int i=0; i<n-2; i++) {
            if(i>0 && arr[i] == arr[i-1]) continue;

            j = i+1;
            k = n-1;

            while(j < k) {
                sum = arr[i] + arr[j] + arr[k];

                if(sum < 0) j++;
                else if(sum > 0) k--;
                else {
                    li.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--; 
                }
            }
        }

        return li;
    }
}
