//Move all the negative elements to one side of the array

import java.util.*;
class array4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements to input");
		int n=sc.nextInt();

		System.out.println("Elements of array are:");
		int arr[] = new int[n];


		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		//System.out.println(Arrays.sort(arr));
		//System.out.println(Arrays.toString(arr));
		//sort it
		Arrays.sort(arr);
		//print the now sorted array
		System.out.println(Arrays.toString(arr));
	}
}