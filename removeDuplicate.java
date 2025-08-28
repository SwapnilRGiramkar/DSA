//Remove duplicate From Sorted array DSA Problem from Leetcode problem no 26 from Array
package basicDSA;
//Remove duplicate of an array if array is an ascending oreder

public class RemoveDuplicate 
{
	public static int removeDuplicate(int[] nums)
	{
		if(nums.length==0)
			return 0;
	
		int j=0;
		for(int i=0;i<nums.length;i++)
		{
			
			if(nums[i]!=nums[j])
			{
				j++;
				nums[j]=nums[i];
			}
		}
		return j+1;
	}
	public static void main(String[] args) 
	{
int[] nums = {1,2,2};
        
        int k = removeDuplicate(nums);
        System.out.println("Unique count = " + k);
        
        for(int i = 0; i < k; i++)
        {
            System.out.print(nums[i] + " ");
        }
	}
}


  
