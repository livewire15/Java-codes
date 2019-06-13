import java.util.Scanner;

public class rangeCoinBoxes {

	
	public static void main(String[] args) {
		// Write your code here
      
	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int arr[]=new int[n+1];
      int arr2[]=new int[n+1];
      int start[]=new int[n+1];
       int end[]=new int[n+1];
      for(int i=0;i<m;i++)
      {
        int p=sc.nextInt();
        int q=sc.nextInt();
        start[p-1]++;
        end[q-1]++;
      }
      
      arr[0]=start[0];
      for(int i=1;i<n;i++)
      {
        arr[i]=start[i]+arr[i-1]-end[i-1];
      }
      
      for(int i=0;i<n;i++)
      {
        arr2[arr[i]]++;
      }
      
      for(int i=n-2;i>=0;i--)
      {
        arr2[i]+=arr2[i+1];
      }
      
      int q=sc.nextInt();
      for(int j=0;j<q;j++)
      {
        System.out.println(arr2[sc.nextInt()]);
      }
      
	}

}