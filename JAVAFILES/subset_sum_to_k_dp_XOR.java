import java.util.Scanner;

public class subset_sum_to_k_dp_XOR {

	
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
		boolean dp[][]=new boolean[2][k+1];
      
      for(int i=0;i<=k;i++)
      {
        dp[0][i]=false;
      }
      
  dp[0][0]=true;
      
	  int flag=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=k;j++)
        {
          dp[flag][j]=dp[flag^1][j];
          if(arr[i-1]<=j)
            dp[flag][j]=dp[flag][j] || dp[flag^1][j-arr[i-1]];
        }
		flag=flag^1;
      }
	  //since array of size 2 is made we need to copy row 1 values to 0 and then 0 to row 1 and again..
	  //So toggle (XOR) can be used to switch between 0 and 1.(Important)
      if(dp[flag^1][k]==true)
      System.out.println("Yes");
      else
        System.out.println("No");
    }
}