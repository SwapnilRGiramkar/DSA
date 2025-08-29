//This Program gives the Second Smallest Element of an Array
//example
package basicDSA;
import java.util.Arrays;
public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		int []arr={ 12, 35, 1, 10, 34, 1 };
		Arrays.sort(arr);
		System.out.println(secondSmallest(arr));
	}
	public static int secondSmallest(int []arr)
	{
		int i=0;
		int n=i+1;
		for(;i<arr.length;i++)
		{
			if(arr[i]!=arr[n])
			{
				return arr[i];
			}
		}
		return -1;
	}
}
