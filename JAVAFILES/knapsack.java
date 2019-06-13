import java.util.*;
public class knapsack {
		
	public static int knapsack(int[] weight,int value[],int maxWeight){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
      int ans[][]=new int[weight.length][maxWeight+1];
		return sack(weight,value,maxWeight,weight.length,ans);
	}
	
  static int sack(int weight[],int value[],int maxWeight,int n,int ans[][])
  {
    if(maxWeight==0 || n==0)
      return 0;
     if(ans[n-1][maxWeight]>0)
        return ans[n-1][maxWeight];
    else
	{     
		int op1=0;
    if(weight[n-1]<=maxWeight)
      op1=value[n-1]+sack(weight,value,maxWeight-weight[n-1],n-1,ans);
   int op2=sack(weight,value,maxWeight,n-1,ans);
      int op=Math.max(op1,op2);
      ans[n-1][maxWeight]=op;
      return op;
    }
  }
  
  public static void main(String args[])
  {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int wt[]=new int[n];
int val[]=new int[n];
for(int i=0;i<n;i++)
{
	wt[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
	val[j]=sc.nextInt();
}
int cap=sc.nextInt();
  System.out.println(knapsack(wt,val,cap));
  }
}