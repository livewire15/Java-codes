import java.util.*;
public class test19
{		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[3];
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		int dp[]=new int[4001];
		Arrays.fill(dp,0);
		Arrays.sort(arr);
		dp[arr[0]]=1;
		for(int i=arr[0]+1;i<=n;i++)
		{
			if(i<=arr[1])
			{
				dp[i]=dp[i-arr[0]];
			}
			else if(i<=arr[2])
			{
				dp[i]=Math.max(dp[i-arr[0]],dp[i-arr[1]]);
			}
			else
			{
				dp[i]=Math.max(dp[i-arr[0]],Math.max(dp[i-arr[1]],dp[i-arr[2]]));
			}
			
			if(dp[i]>0 || i==arr[1] || i==arr[2])
			{
				dp[i]=dp[i]+1;
			}
		}
		//for(int i=0;i<dp.length;i++)
		//	System.out.print(dp[i]+"" );
		if(dp[n]==0)
			System.out.println(1);
		else
			System.out.println(dp[n]);
	}
}
		