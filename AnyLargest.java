//In this code we can find Any Largest element of an array 
//example-->
package basicDSA;
import java.util.Scanner;
import java.util.Arrays;
public class AnyLargest 
{
	public static void main(String[] args)
	{
		int []arr=  {1, 1, 2, 3, 4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter which Largest Element of an Array You Want");
		int num=sc.nextInt();
		
		if(largestElement(arr,num) == -1) {
            System.out.println(num+"-th Largest Element does not exist.");
        } else {
            System.out.println(num+"-th Largest Element of the Array is: "+largestElement(arr,num));
        }
		sc.close();
	}
	public static int largestElement(int[]arr,int num)
	{
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int count=0;
		int prev=Integer.MIN_VALUE;
		//if(num==1)return arr.length-1;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]!=prev)
			{
				count++;
				prev=arr[i];
			}
			
			if(count==num)return arr[i];
		}
		return -1;
	}
}

