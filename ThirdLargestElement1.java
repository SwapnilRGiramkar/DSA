//This is the example of Fiding the Third Largest Element of an Array using Bubble Sort
//example
package basicDSA;

import java.util.Arrays;

public class ThirdLargest1 
{
	public static void main(String[] args) 
	{
		int []arr= {19, -10, 20, 14, 2, 16, 10};

		System.out.println("Third Largest Element of an Array "+thirdLargest(arr));
	}
	public static int thirdLargest(int []arr)
	{
		int n=arr.length;
		for(int i=0;i<=n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int k=n-1;k>=0;k--)
		{
			
			if(arr[k]!=arr[n-3])
			{
				return arr[n-3];
			}
			
		}
		return -1;
	}

}

