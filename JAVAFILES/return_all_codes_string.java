public class solution {

    // Return a string array that contains all possible codes
    public static  String[] getCode(String input){
        // Write your code here
        String ans[]=new String[100000];
          int ap[]=new int[1];
        ap[0]=0;
          code(input,"",ans,ap);
          String r[]=new String[ap[0]];
      for(int i=0;i<ap[0];i++)
      {
        r[i]=ans[i];
      }
      return r;
    }
  public static void code(String in,String out,String ans[],int ap[])
  {
    if(in.length()==0)
    {
      ans[ap[0]]=out;
      ap[0]=ap[0]+1;
    }
    else
    {
      code(in.substring(1),out+(char)((int)in.charAt(0)+48),ans,ap);
      if(in.length()>1)
      {
        int n=Integer.parseInt(in.substring(0,2))+96;
        if(n<123)
        {
          code(in.substring(2),out+(char)n,ans,ap);
        }
      }
    }
  }

}