import java.util.*;
class Main5
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
    	int arr[]=new int[n];
        int per[]=new int[n+1];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=n)
            {
                per[arr[i]]++;
            }
        }
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(per[i]==0)
                count++;
        }
        System.out.println(count);
    }
}
}