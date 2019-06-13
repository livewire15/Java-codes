public class solution {

	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		return subsets(input,input.length,k);
	}
  
  static int[][] subsets(int arr[],int l,int k1)
  {
    if(l==0)
    {
      int ans2[][]=new int[1][0];
      return ans2;
    }
    else
    {
      int ans[][]=subsets(arr,l-1,k1);
      int k=0,row=0,sum=0;
      for(int i=0;i<ans.length;i++)
      {
        sum=0;
        for(int j=0;j<ans[i].length;j++)
      {
          //System.out.println(ans[i][j]);
          sum=sum+ans[i][j];
      }
        if(sum==k1)
        {
          row++;
        }
        else if(sum+arr[l-1]==k1)
          row++;
        
        k++;
      }//making copy
     
      //System.out.println(sum);
      int j=0,p=0;
      int arr2[][]=new int[row][];
      for(int i=0;i<ans.length;i++)
      {
        sum=0;
      for(j=0;j<ans[i].length;j++)
      {
        sum=sum+ans[i][j];
      }
        if(sum==k1)
        {
          arr2[p]=new int[ans[i].length];
          for(j=0;j<ans[i].length;j++)
          {
          arr2[p][j]=ans[i][j];
          }
          p++;
        }
        else if(sum+arr[l-1]==k1)
        {
          arr2[p]=new int[ans[i].length+1];
          for(j=0;j<ans[i].length;j++)
          {
          arr2[p][j]=ans[i][j];
          }
          arr2[p][j]=arr[l-1];
          p++;
        }

      }
      return arr2;
    }
  }
}
