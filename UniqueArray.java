//This is the Example of unique elements array of given array
package arrayPrograms;

import java.util.Arrays;

public class UniqueArray 
{
	public static void main(String[] args) 
	{
		int[]arr= {1,1,1,1,2,2,3,3,3,1,1,3,3,4,4,2,2,5,5};
		int[]ans=unique(arr);
		System.out.println(Arrays.toString(ans));
	}
	public static int[] unique(int[]arr)
	{
		Arrays.sort(arr);
		int i=0;
		for(int j=1;j<arr.length;j++)
		{
			if(arr[i]!=arr[j])
			{
				i++;
				arr[i]=arr[j];
			}
		}
		int k=i+1;
		int[]ans=new int[k];
		for(int l=0;l<k;l++)
		{
			ans[l]=arr[l];
		}
		return ans;
	}
}

