
public class Solution {
	
		
public static long staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
long arr[]=new long[n+1];
  arr[0]=1;
  arr[1]=1;
  arr[2]=2;
  for(int i=3;i<=n;i++)
  {
    arr[i]=arr[i-3]+arr[i-2]+arr[i-1];
  }
  return arr[n];
	}
	
}
