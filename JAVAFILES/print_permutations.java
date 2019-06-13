public class solution {

    public static void permutations(String input){
        // Write your code here

    String out="";
      String ans[]=new String[1000000];
    int ap[]=new int[1];
      ap[0]=0;
      check(input,out,ans,ap);  
    }
	
  public static void check(String in,String out,String ans[],int ap[])
  {
    int n=in.length();
    if(n==0)
    {
      System.out.println(out);
      return ;
    }
    for(int i=0;i<n;i++)
    {
       check(in.substring(0,i)+in.substring(i+1,n),out+in.charAt(i),ans,ap);
    }
    
  }
}