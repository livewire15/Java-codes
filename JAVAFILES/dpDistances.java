import java.util.Scanner;

public class dpDistances {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int k=sc.nextInt();
      int arr[][]=new int[n+1][k+1];
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=k;j++)
        {
          arr[i][j]=sc.nextInt();
        }
      }
      
      int dp[][]=new int[n+2][k+2];
      for(int i=0;i<=n+1;i++)
      {
        dp[i][0]=Integer.MAX_VALUE;
      }
      
      for(int i=0;i<=n+1;i++)
      {
        dp[i][k+1]=Integer.MAX_VALUE;
      }
      
        for(int j=1;j<=k;j++)
        {
          dp[1][j]=arr[1][j];
        }
      
      for(int i=2;i<=n;i++)
      {
        for(int j=1;j<=k;j++)
        {
          dp[i][j]=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i-1][j+1])+arr[i][j];
        }
      }
      
      int min=Integer.MAX_VALUE;
      for(int i=1;i<=k;i++)
      {
        if(dp[n][i]<min)
          min=dp[n][i];
      }
      System.out.println(min);
	}

}