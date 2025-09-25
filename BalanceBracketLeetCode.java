//LeetCode all test Passes in this Balance Brackets problem
public class BalanceBrackets
{
	public boolean isValid(String s)
	{
       if(s.length()!=0 && s.length()%2==0)
       {
            Stack<Character>chars=new Stack<Character>();
            for(int i=0;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if(ch=='(' || ch=='{' || ch=='[')
                {
                    chars.push(ch);
                }
                else if(!chars.isEmpty() && (chars.peek()=='[' && ch==']' || chars.peek()=='{' && ch=='}' || chars.peek()=='(' && ch==')'))
                {
                    chars.pop();
                }
                else
                {
                    return false;
                }
            }
            return chars.isEmpty();
       }
       return false;
       }
    }
    public static void main(String[]args)
    {
	    String s="()[]{}";
	    System.out.println(isValid(s));
    }

}
