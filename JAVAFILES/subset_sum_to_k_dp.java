import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      int k=sc.nextInt();
		boolean dp[][]=new boolean[n+1][k+1];
      
      for(int i=0;i<=k;i++)
      {
        dp[0][i]=false;
      }
      
      for(int i=0;i<=n;i++)
      {
        dp[i][0]=true;
      }
      
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=k;j++)
        {
          dp[i][j]=dp[i-1][j];
          if(arr[i-1]<=j)
            dp[i][j]=dp[i][j] || dp[i-1][j-arr[i-1]];
        }
      }
      if(dp[n][k]==true)
      System.out.println("Yes");
      else
        System.out.println("No");
    }
}