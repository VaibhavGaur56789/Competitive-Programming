//Reverse the array

import java.util.*;
class array1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of an array");
		int n = sc.nextInt();

		System.out.println("Enter elements of array");
		int a[] = new int[n];

		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		//Logic to reverse an array.
		int start=0;
		int end=n-1;
		int temp;

		while(start<end)
		{
			temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start++;
			end--;
		}

		for(int j=0; j<n; j++)
		{
			System.out.println("Reversed array is:"+a[j]);
		}
	}
}
