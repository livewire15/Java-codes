import java.util.*;

public class Main {

	public static void main(String[] args) {
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int arr[]=new int[1000000+1];
      Arrays.fill(arr,1);
      for(int i=2;i<=100;i++) //Applying Sieve algo to precompute all cubic numbers.
      {
        if(arr[i]==1)
        {
        for(int j=i*i*i;j<=1000000;j+=i*i*i)
        {
          arr[j]=0;
        }
        }
      }
      
      int sum[]=new int[1000001];
      sum[1]=1;
      for(int i=2;i<=1000000;i++)
        sum[i]=sum[i-1]+arr[i];
      
      int n=sc.nextInt();
      int j=1;
      while(j<=n)
      {
        int a=sc.nextInt();
        if(arr[a]==0)
          System.out.println("Case "+j+": "+"Not Cube Free");
        else
        {
          System.out.println("Case "+j+": "+sum[a]);
        }
        j++;
      }
	}
}