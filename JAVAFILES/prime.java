import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int arr[]=new int[n+1];
      for(int i=2;i<=n;i++)
      {
        if(arr[i]!=-1)
       {
        arr[i]=1;
          count++;
         // int k=2;
          int j=i+i;
          while(j<=n)
          {
            arr[j]=-1;
            j=j+i;
          }
      }
	}
      System.out.println(count);
    }
}