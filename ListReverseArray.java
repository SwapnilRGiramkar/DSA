//Using the list reverse the array
package basicDSA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverseArray 
{
	public static void main(String[] args) 
	{
		Integer[]arr= {1,2,3,4,5};
		List<Integer> reverse=reverseArray(arr);
		
		System.out.println(reverse);
	}
	public static List<Integer> reverseArray(Integer[]arr)
	{
		List<Integer> list= Arrays.asList(arr);
		Collections.reverse(list);
		return list;
	}
}

