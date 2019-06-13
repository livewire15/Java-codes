import java.util.*;
public class getcodes {

	// Return a string array that contains all possible codes
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
getCode(s);
}
	public static void getCode(String input){
		// Write your code here
		code(input,"");
    }
	
  static void code(String input,String output)
  {      if(input.length()==0)
      {
       System.out.println(output);
      }
      else
      {
		  //System.out.println((char)(Integer.parseInt(input.substring(0,2))+96)+output);
        code(input.substring(1),output+(char)((int)input.charAt(0)+48));
		if(input.length()>1)//since check if string has atleast 2 characters or not
		{
		int n=Integer.parseInt(input.substring(0,2))+96;
		if(n<123)//then check value should be less than 123
		{
        code(input.substring(2),output+(char)n);
      }
	  }
	}
}
}