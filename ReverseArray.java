//This program gives reverse an array
package basicDSA;
import java.util.Arrays;
public class ReverseArray 
{
	public static void reverseArray(int []arr,int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[]ags)
	{
		int []arr= {1,2,3,4,5,6,7,8,9};
		reverseArray(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}

