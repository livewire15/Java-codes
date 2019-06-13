import java.util.*;
public class solution {
    
    public static String[] permutationOfString(String input){
        // Write your code here
      String out="";
      String ans[]=new String[1000000];
    int ap[]=new int[1];
      ap[0]=0;
      check(input,out,ans,ap);
      String r[]=new String[ap[0]];
      for(int i=0;i<ap[0];i++)
      {
        r[i]=ans[i];
      }
      return r;
        
    }
  public static void check(String in,String out,String ans[],int ap[])
  {
    int n=in.length();
    if(n==0)
    {
      ans[ap[0]]=out;
      ap[0]=ap[0]+1;
      return ;
    }
    for(int i=0;i<n;i++)
    {
       check(in.substring(0,i)+in.substring(i+1,n),out+in.charAt(i),ans,ap);
    }
    
  }
    
}