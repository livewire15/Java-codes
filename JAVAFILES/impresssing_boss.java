import java.util.*;

public class impresssing_boss {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
		  int count=0;
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
	  arr[i]=sc.nextInt();
	  }
	  for(int i=0;i<n-1;i++)
	  {
	  if(arr[i]>arr[i+1])
	  {
		  arr[i+1]=arr[i];
	  count++;
	  }
	  }
	
	  if(count<=1)
	  System.out.println("YES");
	  else
	  System.out.println("NO");
	  t--;
	  }
	  }
	  }