//This program gives minimum and maximum number in an array
package basicDSA;

//import java.util.Arrays;

public class MinAndMax 
{
	public static void min(int[]arr,int i)
	{
		//using linear search 
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		min(arr, 0);
	}
}

