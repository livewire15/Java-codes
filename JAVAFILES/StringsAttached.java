import java.util.*;
import java.math.*;
class StringsAttached
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
String s=sc.next();
int n=s.length();
int dp[][]=new int[n+1][26+1];
for(int i=0;i<=n;i++)
{
	Arrays.fill(dp[i],0);
}

for(int i=1;i<=n;i++)
{
	for(int j=1;j<=26;j++)
	{
	dp[i][j]+=dp[i-1][j];
	}
	int ch=(int)s.charAt(i-1)-96;
	dp[i][ch]++;
}


int min=Integer.MAX_VALUE;
int row=0,alpha=0;
for(int i=1;i<=n;i++)
{
	int ch=(int)s.charAt(i-1)-96;
	for(int j=1;j<=26;j++)
	{
		int cost=(int)Math.abs(j-ch);
		int pairs=0;
		for(int k=j+1;k<=26;k++)
		{
			pairs+=dp[n][k]-dp[i][k];
		}
		for(int k=1;k<j;k++)
		{
			pairs+=dp[i-1][k];
		}
		if((pairs+cost)<min)
		{
			row=i;
			alpha=j;
			min=pairs+cost;
		}
	}
}
System.out.println(min+pairs1);
t--;
}
}
}
