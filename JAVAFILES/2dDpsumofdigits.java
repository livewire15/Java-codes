import java.util.Scanner;

public class 2dDpsumofdigits {

	
	public static void main(String[] args) {
		// Write your code here

      Scanner sc=new Scanner(System.in);
      while(true)
      {
      int a=sc.nextInt();
      int b=sc.nextInt();
      if(a==-1 && b==-1)
      	break;
      else
     {
      int sum[]=new int[b+1];
      int arr2[]=new int[b+1];
      sum[0]=0;
      arr2[0]=0;
      for(int i=1;i<10;i++)
      {
        arr2[i]=i;
        sum[i]=i+sum[i-1];
      }
      for(int i=10;i<=b;i++)
      {
     	 sum[i]=sum[i-1]+arr2[i/10]+arr2[i%10];
        arr2[i]=arr2[i/10]+arr2[i%10];
      }
      System.out.println(sum[b]-sum[a-1]);
	}
      }
    }
}