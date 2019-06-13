import java.util.*;
public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
if(s.length()==0)
{
  	String ans="";
      return ans;
}
      else if(s.length()==1)
        return s;
      else
      {
        String output=removeConsecutiveDuplicates(s.substring(1));
        if(s.charAt(0)==s.charAt(1))
          return output;
        else
          return s.charAt(0)+output;
      }
    }
}