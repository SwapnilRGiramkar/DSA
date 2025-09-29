//This is the example of Longest SubString in java 
package basicDSA;

public class LongestSubString 
{
	public static void main(String[] args) 
	{
		String s = "a";
		String ans =longestPal(s);
		System.out.println(ans);
	}
	public static boolean isPalindrome(String s)
	{
		int i=0,j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;j--;
		}
		return true;
	}
	public static String longestPal(String s)
	{
		String ans="";
		int n=s.length();
		if(n==1)return s;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				String sub=s.substring(i, j);
				
				if(isPalindrome(sub) && sub.length() > ans.length())
				{
					ans=sub;
				}
			}
		}
		
		return ans;
	}
}

