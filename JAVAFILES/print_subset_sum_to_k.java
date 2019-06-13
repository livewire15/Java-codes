public class solution {
	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
		subset(input,"",k,input.length,0);
	}
  
  static void subset(int arr[],String s,int k,int l,int sum)
  {
    if(l==0)
    {
     if(sum==k)
       System.out.println(s);
    }
    else
    {
      subset(arr,s,k,l-1,sum);
      subset(arr,arr[l-1]+" "+s,k,l-1,sum+arr[l-1]);       
    }
    }
	}

