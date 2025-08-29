//This is the Example of Finding the Third Largest Element of an Array using inbuilt method od Array class sort
//example
package basicDSA;

import java.util.Arrays;

public class ThirdLargest
{
	public static void main(String[] args)
	{
		int []arr= { 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr);
		System.out.println("Third Largest Element of an Array "+thirdLargest(arr));
	}
	public static int thirdLargest(int []arr)
	{
		int n=arr.length-1;
		for(int i=n-1;i>=0;i--)
		{
			if(arr[i]!=arr[n-2])
			{
				return arr[n-2];
			}
		}
		return -1;
	}
}

