import java.util.*;
public class return_getcodes {

	// Return a string array that contains all possible codes
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String ans[]=getCode(s);
for(int i=0;i<ans.length;i++)
	System.out.println(ans[i]);
}

	public static String[] getCode(String input){
		// Write your code here
		String s[]=new String[10000];
		int ap[]=new int[1];
		ap[0]=0;
		code(input,"",s,ap);
		String f[]=new String[ap[0]];
		for(int i=0;i<ap[0];i++)
			f[i]=s[i];
		return f;
    }
	
  static void code(String input,String output,String s[],int ap[])
  {     
	if(input.length()==0)
      {
       s[ap[0]]=output;
	   ap[0]+=1;
      }
      else
      {
		  //System.out.println((char)(Integer.parseInt(input.substring(0,2))+96)+output);
        code(input.substring(1),output+(char)((int)input.charAt(0)+48),s,ap);
		if(input.length()>1)//since check if string has atleast 2 characters or not
		{
		int n=Integer.parseInt(input.substring(0,2))+96;
		if(n<123)//then check value should be less than 123
		{
        code(input.substring(2),output+(char)n,s,ap);
      }
	  }
	}
}
}