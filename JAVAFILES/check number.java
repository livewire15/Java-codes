public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return check(input,x,input.length);
	}
  
  static boolean check(int arr[],int y,int l)
  {
    if(l==0)
      return false;
    else
    {
      boolean ans=check(arr,y,l-1);
      if(ans==true)
        return true;
      else
      {
        if(arr[l-1]==y)
          return true;
        else 
          return false;
      }
    }
    
	}
}