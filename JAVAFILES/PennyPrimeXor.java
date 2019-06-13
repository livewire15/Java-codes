import java.util.Scanner;

public class PennyPrimeXor {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
      int q=sc.nextInt();
      while(q>0)
      {
      	int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        int ans[]={0};
        fun(q,n,arr,0,ans);
		System.out.println(ans[0]);
        q--;
	}
    }
  
  static void fun(int q,int n,int arr[],int sum,int ans[])
  {
	  if(n==0)
	  {
		//System.out.println(sum);
		if(isPrime(sum))
		{
		ans[0]=(ans[0]+1)%(1000000000+7);
		}
	  }
		else
		{
		fun(q,n-1,arr,sum,ans);
		fun(q,n-1,arr,sum^arr[n-1],ans);
		}
	}
  
  static boolean isPrime(int sum)
  {
	  if(sum==0 || sum==1)
		  return false;
    for(int i=2;i<=sum/2;i++)
    {
      if(sum%i==0)
      {
        return false;
      }
    }
    return true;
  }

}