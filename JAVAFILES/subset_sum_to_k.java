public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		int ans[]=new int[input.length];
		//Arrays.fill()
		subset(input,ans,k,input.length,0);
	}
  
  static void subset(int arr[],int ans[],int k,int l,int sum)
  {
    if(l==0)
    {
     if(sum==k)
	 {
		 for(int i=0;i<ans.length;i++)
			System.out.print(ans[i]+" ");
	 }    
    }
    else
    {
      subset(arr,ans,k,l-1,sum);
	  ans[l-1]=-1;
      subset(arr,ans,k,l-1,sum+arr[l-1]);       
    }
    }
	
	public static void main(String args[])
	{
		int arr[]={1,2,3,4};
		printSubsetsSumTok(arr,5);
	}
	}

