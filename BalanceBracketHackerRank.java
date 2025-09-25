//Balance Bracket Using HackerRank
package collections;

import java.util.EmptyStackException;

public class BalBrack 
{
	public static void main(String[] args)
	{
		String s="{[(])}";
		System.out.println(isBalanced(s));
	}
	 public static String isBalanced(String s) 
	    {
	        String ans="";
	        try
	        {
	            if(s.length()==0 && s.length()%2!=0)
	        {
	            return "NO";
	        }
	            Stack<Character> chars=new Stack<>();
	            for(int i=0;i<s.length();i++)
	            {
	                char ch=s.charAt(i);
	                if(ch=='[' || ch=='(' || ch=='{')
	                {
	                    chars.push(ch);
	                }
	                
	                else 
	                {
	                	if (chars.isEmpty()) {
							return "No";
						}
	                	char top=chars.pop();
	                	if(top!='(' && ch==')' || top!='{' && ch=='}' || top!='[' && ch==']')
		                {
		                    return "No";
		                }
	                }
	               
	            }
	          ans=chars.isEmpty() ? "YES" : "NO";
	        }
	        catch(EmptyStackException e)
	        {
	            System.out.println("Handled");
	        }
	         return ans;
	    }
}

