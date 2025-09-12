//This Program Gives a MAximum Sum of Given SubArray
package strings;

public class MaximumSum
{
	public static void main(String[] args) 
	{
		int []arr= {2,3,-8,7,-1,2,3};
		int sum =maxSum(arr);
		System.out.println(sum);
	}
	public static int maxSum(int []arr)
	{
		int maxSum=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			maxSum= sum > maxSum ? sum : maxSum;
			if(sum<0)
			{
				sum=0;
			}
		}
		return maxSum;
	}
}

