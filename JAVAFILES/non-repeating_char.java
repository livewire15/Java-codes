import java.util.*;

/*
	- You are given a string, that can contain repeating characters.
	- Your task is to return the first character in this string that does not repeat. i.e., occurs exactly once
	- The string will contain characters only from English alphabet set, i.e., ('A' - 'Z') and ('a' - 'z');

*/

public class solution 
{
	public static char firstNonRepeatingChar(String str)
	{
		//	write your code here.
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
      int flag=0,j=0;
      for(int i=0;i<str.length();i++)
      {
        if(map.get(str.charAt(i))==null)
          map.put(str.charAt(i),0);
        
        map.put(str.charAt(i),map.get(str.charAt(i))+1);
      }
      for(j=0;j<str.length();j++)
      {
        if(map.get(str.charAt(j))==1)
        {
          flag=1;
          break;
        }
      }
      if(flag==1)
        return str.charAt(j);
      else
      return 0;
      
}
}
