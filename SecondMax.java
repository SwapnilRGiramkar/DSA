//Second max element of an array using built in method of sorted array
//example
package basicDSA;

import java.util.Arrays;

public class SecondLargestElement 
{
	public static void main(String[] args) 
	{
		int []arr= { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr);
		int ans=secondLargest(arr);
		System.out.println(ans);
	}
	public static int secondLargest(int[] arr)
	{
		int n=arr.length;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]!=arr[n-1])
			{
				return arr[i];
			}
		}
		return -1;

	}
	
}

