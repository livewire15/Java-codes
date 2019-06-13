
public class Solution {

	
	public static int lcs(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	*/
      int dp[][]=new int[s1.length()+1][s2.length()+1];
      for(int i=0;i<=s1.length();i++)
      {
        dp[i][0]=0;
      }
        for(int j=0;j<=s2.length();j++)
        {
          dp[0][j]=0;
        }
      
      for(int i=1;i<=s1.length();i++)
      {
        for(int j=1;j<=s2.length();j++)
        {
          if(s1.charAt(s1.length()-i)==s2.charAt(s2.length()-j))
          {
            dp[i][j]=1+dp[i-1][j-1];
          }
          else
            dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
        }
      }
      return dp[s1.length()][s2.length()];

	}

	
}
