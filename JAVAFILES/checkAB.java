public class Solution {

    public static boolean checkAB(String input) {
        // Write your code here
      if(input.charAt(0)=='b')
        return false;
      else
      {
        boolean ans=check(input);
        return ans;
      }
    }
  public static boolean check(String in)
  {
    if(in.length()==0)
      return true;
    if(in.charAt(0)=='a')
    {
      boolean tmp=check(in.substring(1,in.length()));
      return tmp;
    }
    else{
      if(in.length()==1)
        return false;
      else if(in.length()==2)
      {
        if(in.charAt(1)=='b')
          return true;
        else
          return false;
      }
      else{
        if(in.charAt(1)=='b' && in.charAt(2)=='b')
          return false;
        if(in.charAt(1)=='b' && in.charAt(2)=='a')
        {
          boolean tmp=check(in.substring(2,in.length()));
          return tmp;
        }
        
        else
        {
         return false;
        }
      }
      
    }
  }
  
}