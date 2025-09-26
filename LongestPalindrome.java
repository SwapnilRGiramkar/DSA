//Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
package basicDSA;
//Longest Palindromic SubString 
public class LongestPalindrome
{
	public static void main (String []args)
	{
		String s="abcbe";
		System.out.println(longest(s));
	}
	public static int longest(String s)
	{
		int[]freq=new int[128];
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			freq[c]++;
		}
		int length=0;
		boolean oddFound=false;
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]%2==0)
			{
				length+=freq[i];
			}
			else
			{
				length+=freq[i]-1;
				oddFound  = true;
			}
		}
		if(oddFound)
		{
			length++;
		}
		return length;
	}
}

