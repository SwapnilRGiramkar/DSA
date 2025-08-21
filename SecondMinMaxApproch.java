//This was the second and best approch to find Second min and Second max 
package basicDSA;

public class SecondMinMax 
{
	public static void main (String []args)
	{
		int []arr= {1,2,3,4,5,6,7,8,9,10};
		min2(arr);
	}
	public static void min2(int []arr)
	{
		if(arr.length<2)
		{
			System.out.println("Array to Small Cannot find Second min/max ");
			return;
		}
		int min=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax && arr[i]!=max)
			{
				secondMax=arr[i];
			}
			
			if(arr[i]<min)
			{
				secondMin=min;
				min=arr[i];
			}
			else if(arr[i]<secondMin && arr[i]!=min)
			{
				secondMin=arr[i];
			}
		}
		System.out.println("First Max : "+max);
		
		System.out.println(secondMax==Integer.MIN_VALUE ? "Second Max : Not Found " : "Second Max : "+secondMax);

		System.out.println("First Min : "+min);
		
		System.out.println(secondMin==Integer.MAX_VALUE ? "Second Min : Not Found ": "Second Min : "+secondMin);
		
	}
}

