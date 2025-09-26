//This is the example of Valid Palindrome or Not
package basicDSA;
//Removing Non alpha neumeric characters 
public class ValidPalindrome 
{
	public static void main(String[] args) 
	{
		String s="A man, a plan, a canal: Panama";
		System.out.println(validPal(s));
	}
	public static boolean validPal(String s)
	{
		s=s.toLowerCase();
		s=s.replaceAll("[^a-z0-9]", "");
		int i=0;int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;j--;
		}
		return true;
	}
}

