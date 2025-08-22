//This program gives the user input to find the binary search
//example
package basicDSA;

import java.util.Scanner;

public class BinarySearch1 
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
			else if(arr[i]<mid)
			{
				i=mid+1;
			}
			else
			{
				j=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size Of an Array ");
		int length=sc.nextInt();
		int []arr=new int[length];
		System.out.println("Enter the array Element ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the elemnt you want to search ");
		int search=sc.nextInt();
		int ans=binary(arr, search);
		if(ans!=-1)
		{
			System.out.println(search+" Element Found at the Index "+ans);
		}
		else
			System.out.println("Element Not Found at the Index");
		sc.close();
	}

}
