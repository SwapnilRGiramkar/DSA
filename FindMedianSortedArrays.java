//DSA LeetCode Quetion no 4 Median of Two Sorted Array
package basicDSA;

import java.util.Arrays;

public class Median 
{
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
		int j=0;
        int[] ans =new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++)
        {
            ans[j++]=nums1[i];
        }
        for(int i=0;i< nums2.length;i++)
        {
            ans[j++]=nums2[i];
        }
        for(int i=0;i<ans.length;i++)
        {
        	for(int k=i+1;k<ans.length;k++)
        	{
        		if(ans[i]>ans[k])
            	{
            		int temp=ans[i];
            		ans[i]=ans[k];
            		ans[k]=temp;
            	}
        	}
        }
        
        System.out.println(Arrays.toString(ans));
       
        int n=ans.length;
        if(n%2!=0)
        {
        	return ans[n/2];
        }
        else
        {
        	return(ans[(n-1)/2]+ans[n/2])/2.0;
        }
       
    }
	public static void main(String[] args) 
	{
		int[] nums1= {2,2,4,4};
		int[] nums2= {2,2,2,4,4};
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

}

