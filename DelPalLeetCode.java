//Problem on Leetcode dlete Palindrome 
package basicDSA;

public class DelPalLeetCode
{
	public static void main(String[] args)
	{
		String s="deeee";
		boolean ans=validPalindrome(s);
		System.out.println(ans);
	}
	public static boolean validPalindrome(String s)
    {
        s=s.toLowerCase();
        
        int i=0;int j=s.length()-1;       
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;j--;
            }
            else
            {
               return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
        } 

        return true;
    }
    public static boolean isPalindrome(String s,int i,int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }
}

