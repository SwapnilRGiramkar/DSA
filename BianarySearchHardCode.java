//This is the Program of searching the element using the binary search
//example
package basicDSA;

public class BinarySearch 
{
	public static int binary(int[]arr,int search)
	{
		int i=0;int j=arr.length-1;
		for(;i<arr.length-1;i++)
		{
			if(search==arr[i])
			{
				return i;
			}
			else if(search==arr[j])
			{
				return j;
			}
			else
			{
				i++;j--;
			}
		}
		return-1;
	}
	public static void main(String[] args)
	{
		int []arr= {3,2,4,5,1,6,7,83,67,8,3,6,8};
		int search=83;
		int ans=binary(arr, search);
		if(ans!=-1)
		{
			System.out.println(search+ " Element Found at the Index of "+(ans+1));
		}
		else
			System.out.println("Element Not Found in the Array");
	}
}

