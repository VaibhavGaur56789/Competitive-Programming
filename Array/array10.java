//Merge 2 sorted arrays without using Extra space

import java.util.*;
public class array10 {
    public void merge(int[] arr1, int[] arr2)
    {
        int m = arr1.length;
        int n = arr2.length;

        for(int i=0; i<m; i++) {
            if(arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;

                int first = arr2[0];

                int k;
                for(k=1; k<n && arr2[k] < first; k++) {
                    arr2[k-1] = arr2[k];
                }
                arr2[k-1] = first;
            }
        }

    }
    public static void main (String[] args)
    {
        array10 a = new array10();

        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };

        a.merge(X, Y);

        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}
