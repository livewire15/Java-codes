
public class Solution {

	
	public static int editDistance(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	*/
    int m=s2.length();
	int n=s1.length();
      return edit(s1,s2,m,n);
	}
  
  static int edit(String s1,String s2,int m,int n)
  {
    int arr[][]=new int[m+1][n+1];
    for(int i=0;i<=n;i++)
    {
      arr[0][i]=i;
    }
    
    for(int j=0;j<=m;j++)
    {
      arr[j][0]=j;
    }

    for(int i=1;i<=m;i++)
    {
      for(int j=1;j<=n;j++)
      {
        if(s2.charAt(i-1)==s1.charAt(j-1))
        {
          arr[i][j]=arr[i-1][j-1];
        }  
        else
        {
          arr[i][j]=1+Math.min(arr[i-1][j-1],Math.min(arr[i-1][j],arr[i][j-1]));
        } 
      }
    }
    return arr[m][n];
	
}
}