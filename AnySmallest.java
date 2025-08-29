//This Program gives any Smallest number of an Array
//example
package basicDSA;

import java.util.Arrays;
import java.util.Scanner;
public class AnySmallest 
{
	public static void main(String[] args) 
	{
		
		int []arr=  {1, 1, 2, 3, 4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which Smallest Element you want to Find in This Array "+(arr.length));
		int num=sc.nextInt();
		System.out.println(num+" Smallest Element of an Array "+thirdSmallest(arr,num));
		sc.close();
	}
	public static int thirdSmallest(int []arr,int num)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int count=1;
		int prev=arr[0];
		if(num==1)
		{
			return prev;
		}
		for(int k=1;k<arr.length;k++ )
		{
			if(arr[k]!=prev)
			{
				count++;
			}
			prev = arr[k];
			if(count==num)return arr[k];
		}
		return -1;
	}
}

