public class Solution {
  
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
      int ans=sum2(input,input.length);
      return ans;
    }
  static int sum2(int arr[],int l)
  {
    if(l==0)
      return 0;
    else
    {
      int ans=sum2(arr,l-1);
      return ans+arr[l-1];
    }
  }
}
		