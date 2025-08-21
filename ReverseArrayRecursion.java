//This Recursion using reverse the array
package basicDSA;

import java.util.Arrays;

public class ReverseArrayRecursion 
{
	public static void recuesiveArray(int []arr,int i,int j)
	{
		if(i>=j)return;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		recuesiveArray(arr, i+1, j-1);
	}
	public static void main(String[] args)
	{
		int []arr= {1,2,3,4,5,6,7,8,9};
		recuesiveArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

