//Largest Element Of An Arrayusing Sorting 
package basicDSA;

import java.util.Arrays;

public class LargestElementOfAnArray_Sorting
{
	public static void main(String[] args) 
	{
		int arr1[] =  {2,5,1,3,0};
		System.out.println("Largest Element of an Array is : "+largestElement(arr1));
		
		int arr2[] =  {8,10,5,7,9};
	    System.out.println("The Largest element in the array is: "+largestElement(arr2));
	}
	public static int largestElement(int []arr)
	{
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		return max;
	}
}

