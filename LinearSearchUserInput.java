//In this java program user gives the input for an Array and the search Element
package basics;

import java.util.Scanner;

public class LinearSearch 
{
	public static int linearSerch(int[]arr,int search)
	{
		for(int i=0;i<arr.length;i++)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of an array ");
		int length=sc.nextInt();
		int []arr=new int[length];
		System.out.println("Enter the Array Element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println();
		System.out.println("Enter the searching element");
		int search=sc.nextInt();
		int ans=linearSerch(arr, search);
		System.out.println();
		if(ans!=-1)
		{
			System.out.println(search+" Element found at index "+(ans+1));
		}
		else
			System.out.println("Element Not Found in Array");
		sc.close();
	}
}

