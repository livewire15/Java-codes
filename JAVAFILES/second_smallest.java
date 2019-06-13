import java.util.*;
class second_smallest 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int arr[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
    	}
        int q=sc.nextInt();
        while(q-->0)
        {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int min1=1000000,min2=1000000;
            for(int i=l;i<=r;i++)
            {
                if(arr[i]<min1)
                {
                    min2=min1;
                    min1=arr[i];    
                }
                else if(arr[i]<min2)
                {
                    min2=arr[i];
                }
                else if(min1==min2)
                {
                    min2=arr[i];
                }
            }
            if(min1==min2)
                System.out.println(-1);
            else
                System.out.println(min2);
        }
    }
}