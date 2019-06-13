
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
      char c;
      if(input.length()==0)
        return ""; 
      else
      {
        if(input.charAt(0)!=c1)
          c=input.charAt(0);
        else         
         c=c2;
        
        String ans=replaceCharacter(input.substring(1),c1,c2);
        return (c+ans);
      }
	}
}
