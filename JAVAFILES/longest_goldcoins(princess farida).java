import java.util.*;

public class Main 
{
	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      int p=1;
      
      while(p<=t)
      {
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
        long ans[]=new long[n];
        ans[0]=arr[0];
        if(n>1)
        	ans[1]=arr[1];
        
        if(n==1)
          System.out.println("Case "+p+":"+" "+ans[n-1]);
        else if(n==2)
           System.out.println("Case "+p+":"+" "+Math.max(ans[n-1],ans[n-2]));
        else
      {
        for(i=2;i<n;i++)
        {
          long max=0;
          for(int j=i-2;j>=0;j--)
          {
            if(ans[j]+arr[i]>max)
              max=ans[j]+arr[i];
          }
          ans[i]=max;
      	}
        Arrays.sort(ans);
        System.out.println("Case "+p+":"+" "+ans[n-1]);
   	  }
        
         p=p+1;
   }
  }
}