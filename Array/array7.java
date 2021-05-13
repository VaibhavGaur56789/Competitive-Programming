//Program to cyclically rotate an array by one.



public class array7 {
    public void rotate(int[] arr) {
        int x = arr[arr.length - 1];
        for(int i=arr.length - 1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x;
    }
    public static void main(String[] args) {
        array7 a = new array7();

        int[] arr = {1,2,3,4,5};

       /* for(int i=0; i<arr.length; i++)
        System.out.println("Given array"+arr[i]); */

        a.rotate(arr);

        for(int j=0; j<arr.length; j++)
        System.out.println(arr[j]);
    }
}
