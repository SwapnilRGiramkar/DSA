//This is the Program of searching the element using the binary search
//example
package basicDSA;

public class BinarySearch 
{
	public static int binary(int[]arr,int search)
	{
		int i=0;int j=arr.length-1;
		while(i<=j)
		{
			int mid=(i+(j-i))/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(arr[mid]<search)
			{
				i=mid+1;
			}
			else
			{
				j=mid-1;
			}
		}
		return-1;
	}
	public static void main(String[] args)
	{
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		int search=5;
		int ans=binary(arr, search);
		if(ans!=-1)
		{
			System.out.println(search+ " Element Found at the Index of "+ans);
		}
		else
			System.out.println("Element Not Found in the Array");
	}
}




