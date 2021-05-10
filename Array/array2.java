//Find the maximum and minimum element in an array

import java.util.*;
class array2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements");
		int n = sc.nextInt();

		System.out.println("Enter array elements");
		int a[] = new int[n];

		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		int max=0;
		int min=1;

		for(int j=2; j<a.length; j++)
		{
			if(a[j] > max)
			{
				max=a[j];
			}
			else if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println("Maximun:"+max);
		System.out.println("Minimum:"+min);
	}
}


