import java.util.*;
class test42 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        int k=sc.nextInt();
    	int arr[]=new int[n];
        int sum=0;
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=sc.nextInt();
            if(i%2==0)
                sum+=arr[i];
            else
                sum-=arr[i];
    	}
        if(Math.abs(sum)>=k)
            System.out.println(1);
        else
            System.out.println(2);

    }
}
}