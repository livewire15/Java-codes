import java.util.*;
class test26
{		
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		long dp[]=new long[n];
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		if(i==0)
			dp[i]=arr[i];
		else
			dp[i]=(long)(dp[i-1]*(long)arr[i]);
		}
		
		int count=0;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				if(i==1)
				{
				long ans=dp[n-1]/arr[j-1];
				long rem=gcd(ans,arr[j-1]);
					if(rem==1)
					{
						if(j>1 && j<n)
							count=(count+2)%(1000000007);
						else
							count=(count+1)%(1000000007);
					}
				}
			else
			{
				if(i!=j)
				{
				long val=dp[j-1]/dp[j-i-1];
				long ans=dp[n-1]/val;
				long rem=gcd(val,ans);
				if(rem==1)
					count=(count+1)%(1000000007);
				}
				else
				{
				long val=dp[j-1];
				long ans=dp[n-1]/val;
				long rem=gcd(val,ans);
				if(rem==1)
					count=(count+1)%(1000000007);
				}
			}
			}
		}
		System.out.println(count%(1000000007));
		t--;
		}
		}
					
	public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
	}
 
		
