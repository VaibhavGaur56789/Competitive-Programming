//Find the Union and Intersection of the two sorted arrays.

import java.util.*;
public class array5 {
    public void union(int[] arr1, int[] arr2, List<Integer> finalList) {
        int i=0, j=0;

        while(i < arr1.length && j < arr2.length) {
            while((i < arr1.length - 1) && (arr1[i] == arr1[i+1])) {
                i++;
            }
            while((j < arr2.length - 1) && (arr2[j] == arr2[j+1])) {
                j++;
            }

            if(arr1[i] < arr2[j]) {
                finalList.add(arr1[i++]);
            }
            else if(arr1[i] > arr2[j]) {
                finalList.add(arr2[j++]);
            }
            else {
                finalList.add(arr1[i]);
                i++;
                j++;
            }
        }

        while(i < arr1.length) {
            if(i < arr1.length - 1 && arr1[i] == arr1[i+1]) {
                i++;
            }
            else {
                finalList.add(arr1[i++]);
            }
        }

        while(j < arr2.length) {
            if(j < arr2.length - 1 && arr2[j] == arr2[j+1]) {
                j++;
            }
            else {
                finalList.add(arr2[j++]);
            }
        }
    }
}

class Arrayex {
    public static void main(String[] args) {
        array5 a = new array5();
        int[] arr1 = {2, 2, 3, 4, 4, 4, 7, 8};
        int[] arr2 = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};
        List<Integer> finalList = new ArrayList<> ();
        a.union(arr1, arr2, finalList);
        System.out.println(finalList);
    }
}