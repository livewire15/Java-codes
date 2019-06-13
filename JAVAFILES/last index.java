
public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      return index(input,x,0);
	}
  static int index(int arr[],int y,int start)
  {
    if(start==arr.length)
      return -1;
    else
    {
      int ans=index(arr,y,start+1);
      if(ans==-1)
      {
        if(arr[start]==y)
          return start;
        else
          return -1;
      }
      else
        return ans;
    }
  }
	
}