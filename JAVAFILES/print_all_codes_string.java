public class solution {

	public static void printAllPossibleCodes(String input) {
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
		if(input.length()>1)
		{
		int n=Integer.parseInt(input.substring(0,2))+96;
		if(n<123)
		{
        code(input.substring(2),output+(char)n);
      }
	  }
	}
}
}
