
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
     return index(input,x,input.length);
		
	}
  static int index(int arr[],int y,int l)
  {
    if(l==0)
      return -1;
    else
    {
      int ans=index(arr,y,l-1);
      if(ans==-1)
      {
        if(arr[l-1]==y)
          return l-1;
        else
          return -1;
      }
      else
      {
        return ans;
      }
    }
  }
	
}