import java.lang.*;
public class loot_houses {
public static void main(String args[])
{
int arr[]={5};
System.out.println(getMaxMoney(arr,1));
}
	public static int getMaxMoney(int arr[], int n){

		/*Your class should be named Solution. 
		*Don’t write main(). 
	 	*Don’t take input, it is passed as function argument.
	 	*Don’t print output.
	 	*Taking input and printing output is handled automatically.
		*/ 		
      if(n==1)
        return arr[0];
      int dp[]=new int[n];
      dp[0]=arr[0];
      dp[1]=Math.max(arr[0],arr[1]);
		for(int i=2;i<n;i++)
        {
          dp[i]=Math.max(dp[i-1],arr[i]+dp[i-2]);
        }
      return dp[n-1];
	}
}
