import java.util.*;
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

     return remove(s,s.length());
}
 static LinkedHashSet<Character> set=new LinkedHashSet<Character>();
  static String remove(String s,int index)
  {
    if(index==0)
    {
	 String ans="";
    return ans;
    }
    else
    {
      String output=remove(s,index-1);
      if(!set.contains(s.charAt(index-1)))
      {
        set.add(s.charAt(index-1));
        output+=s.charAt(index-1);
        return output;
      }
      else
      {
        return output;
      }
    }
  }
}