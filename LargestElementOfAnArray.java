//Largest Element of An Array 
package basicDSA;

public class LargestElementOfAnArray 
{
	public static int largestElement(int []arr)
	{
		int max=arr[0];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int arr1[] =  {2,5,1,3,0};
		System.out.println("Largest Element of an Array is : "+largestElement(arr1));
		
		int arr2[] =  {8,10,5,7,9};
	    System.out.println("The Largest element in the array is: "+largestElement(arr2));
	}
}

