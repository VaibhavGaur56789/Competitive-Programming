//Find the "Kth" max and min element of an array

//METHOD 1
import java.util.*;
class array3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Number of array elements");
		int n = sc.nextInt();

		System.out.println("Value to find");
		int k = sc.nextInt();

		System.out.println("Array elements");
		int a[] = new int[n];

		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		System.out.println(a.length-k);    // complexity: nLog(n) because of sorting.
	}
}

//METHOD 2 (Using max heap)