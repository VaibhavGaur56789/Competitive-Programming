//Minimise the maximum difference between heights

import java.util.*;

public class array9 {
    public void getMinDiff(int[] arr, int n, int k) {

        int r=0, max=0, min=0;
        Arrays.sort(arr);
        r = arr[n-1] - arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] > k) {
            max = Math.max(arr[i-1] + k, arr[n-1] - k);
            min = Math.min(arr[i] - k, arr[0] + k);
            r = Math.min(r, max-min);
        }
        else {
            continue;
        }
    }
        System.out.print(r);
}

public static void main(String[] args) {
    array9 a = new array9();

    int[] arr = {1,5,8,10};
    int k = 4;
    int n = arr.length;
    a.getMinDiff(arr, n, k);

    //System.out.println(a.maxSubArray());

    }
}
