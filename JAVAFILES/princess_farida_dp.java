import java.util.*;

public class princess_farida_dp {

	
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
        if(n>0)
        	ans[0]=arr[0];
        if(n>1)
        	ans[1]=Math.max(arr[0],arr[1]);
        for(i=2;i<n;i++)
        {
          ans[i]=Math.max(ans[i-2]+arr[i],ans[i-1]);
        }
        System.out.println("Case "+p+":"+ans[n-1]);
        p++;
      }        
}
}