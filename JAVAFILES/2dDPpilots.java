import java.util.Scanner;

public class 2dDPpilots {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
      }
      int dp[][]=new int[n+1][5000+1];
      System.out.println(fun(n,a,b,0,0,0,dp));
	}
  
  static int fun(int n,int a[],int b[],int i,int j,int x,int dp[][])
  {
    if(n==0)
      return 0;
    if(i>=b.length || j>=a.length)
      return Integer.MAX_VALUE;
    
    if(x==0)
    {
     return b[i]+fun(n-1,a,b,i+1,j+1,x+1,dp);
    }
    else if(x==n)
    {
      return a[j]+fun(n-1,a,b,i+1,j+1,x-1,dp);
    }
    if(dp[n][x]>0)
      return dp[n][x];
    else
    {
      int op1=b[i]+fun(n-1,a,b,i+1,j+1,x+1,dp);
      int op2=a[j]+fun(n-1,a,b,i+1,j+1,x-1,dp);
      dp[n][x]=Math.min(op1,op2);
      return dp[n][x];
    }
  }

}