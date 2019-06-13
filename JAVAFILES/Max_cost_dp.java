import java.util.*;
class Max_cost_dp 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
    	int arr[][]=new int[n][n];
    	for(int i=0;i<n;i++)
    	{
            for(int j=0;j<n;j++)
            {
    		arr[i][j]=sc.nextInt();
    	   }
        }

        int dp[][]=new int[n][n];
        dp[n-1][n-1]=arr[n-1][n-1];
        dp[n-1][n-2]=arr[n-1][n-1];
        dp[n-2][n-1]=arr[n-1][n-1];

        for(int i=n-3;i>=0;i--)
        {
            dp[n-1][i]=dp[n-1][i+1]+arr[n-1][i+1];
        }

         for(int i=n-3;i>=0;i--)
        {
            dp[i][n-1]=dp[i+1][n-1]+arr[i+1][n-1];
        }

        for(int i=n-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                float val=(float)Math.log(i+1)/(float)Math.log(2) + (float)Math.log(j+1)/(float)Math.log(2);
                if(val==(int)val)
                {
                    dp[i][j]=dp[i+1][j+1]+arr[i+1][j+1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i+1][j]+arr[i+1][j],dp[i][j+1]+arr[i][j+1]);
                }
            }
        }

            System.out.println(dp[0][0]);
       
        t--;
    }
}
}