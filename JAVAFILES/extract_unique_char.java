import java.util.*;
public class solution {

	public static String uniqueChar(String str){
		// Write your code here
HashSet<Character> set=new HashSet<Character>();
      String p="";
      for(int i=0;i<str.length();i++)
      {
        if(!set.contains(str.charAt(i)))
        {
        set.add(str.charAt(i));
          p=p+str.charAt(i);
      }
	}
      return p;
}
}
