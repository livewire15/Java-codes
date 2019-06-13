class lcs_dp_recursive
{
public static void main(String args[])
{
int dp[][]=new int[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
dp[i][j]=-1;
}
}
System.out.println(lcs(dp,"abcdefgh","bdehfkdsj",8,9));
}

static lcs(int dp[][],String s1,String s2,int m,int n)
{
if(m==0 || n==0)
	return 0;
if(dp[m][n]>-1)
	return dp[m][n];
int ans;
	if(s1.charAt(m-1)==s2.charAt(n-1))
		ans=1+lcs(dp,s1,s2,m-1,n-1);
	else
	{
		int option1=lcs(dp,s1,s2,m-1,n);
		int option2=lcs(dp,s1,s2,m,n-1);
			ans=Math.max(option1,option2);
	}
	dp[m][n]=ans;
	return ans;
}
}

}