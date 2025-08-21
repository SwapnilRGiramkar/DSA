//This is the best Approch for Linear Search
package basicDSA;

public class LinearSearch 
{
	public static int linearSearch(int[]arr,int search,int i)
	{
		for(;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int []arr= {3,41,25,8,6,4,0};	
		int result=linearSearch(arr, 0,0);
		System.out.println(result!=-1 ? "Searching Number Found at Index "+result : "Search Number is not Found");
	}
}

