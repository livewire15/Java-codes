import java.util.*;
public class Solution {
		
	public static int knapsack(int[] weight,int value[],int maxWeight){

	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
      int ans[][]=new int[weight.length+1][maxWeight+1];
		return sack(weight,value,maxWeight,weight.length,ans);
	}
	
  static int sack(int weight[],int value[],int maxWeight,int n,int ans[][])
  {
    int i=0,j=0;
    for(i=0;i<=maxWeight;i++)
    {
      ans[0][i]=0;
    }
    
      for(j=0;j<=weight.length;j++)
      {
       ans[j][0]=0; 
      }
    
    for(i=1;i<=weight.length;i++)
    {
      for(j=0;j<=maxWeight;j++)
      {
        ans[i][j]=ans[i-1][j];
        if(weight[i-1]<=j)
          ans[i][j]=Math.max(ans[i][j],value[i-1]+ans[i-1][j-weight[i-1]]);
      }
    }
    return ans[weight.length][maxWeight];
    }
    
  }