public class test5 {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		int ans[]=new int[input.length];
		subset(input,"",k,input.length,0,ans);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}
	}
  
  static void subset(int arr[],String s,int k,int l,int sum,int ans[])
  {
    if(l==0)
    {
     if(sum==k)
   {
   		for(int i=0;i<s.length();i++)
		{
		ans[Integer.valueOf(s.charAt(i))]=-1;
		}
		return;
    }
	}
    else
    {
      subset(arr,s,k,l-1,sum,ans);
      subset(arr,arr[l-1]+s,k,l-1,sum+arr[l-1],ans);   
    }
    }
	public static void main(String args[])
	{
		int arr[]={1,2,3,4};
		int ans[]=new int[arr.length];
		printSubsetsSumTok(arr,5);
	}
	}

