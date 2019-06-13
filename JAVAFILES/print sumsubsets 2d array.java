public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here
       //int arr2[][]=new int[1][1];
		return subset(input,input.length);
	}
  
  static int[][] subset(int arr[],int l)
  {
    if(l==0)
    {
      int arr2[][]=new int[1][0];
      return arr2;
    }
    else
    {
      int ans[][]=subset(arr,l-1);
	  int output[][]=new int[2*ans.length][];
      int k=0,row=0;
      for(int i=0;i<ans.length;i++)
      {
		  int sum=0;
    	output[k]=new int[ans[i].length];
        for(int j=0;j<ans[i].length;j++)
      {
        output[k][j]=ans[i][j];
		sum+=ans[i][j];
      }
	  if(sum==k1)
		  row++;
	  else if(sum+arr[l-1]==k1)
		  row++;
	  
        k++;
      }//making copy
     
      int j=0;
	  int op[][]=new int[row][];
      for(int i=0;i<ans.length;i++)
      {
		  int sum=0;
        output[k]=new int[ans[i].length+1];
          for(j=0;j<ans[i].length;j++)
      {
        output[k][j]=ans[i][j];
		sum=sum+ans[i][j];
      }
	  if(sum==k1)
        output[k][j]=arr[l-1];
        k++;
      }
      return output;
        
      }
    }
  }

