import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        long m=sc.nextLong();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextLong();
        }
        long b[]=new long[n];
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextLong();
        }
        long max=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]*b[i]>max)
                max=a[i]*b[i];
        }
        long start=0,end=max,mid=0;
        long ans=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(fun(a,b,mid,n,m))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        System.out.println(ans);
}

static boolean fun(long a[],long b[],long mid,int n,long m)
{
    for(int i=0;i<n;i++)
    {
        if(a[i]*b[i]<mid)
            continue;
        long val=mid/b[i];
        long val1=a[i]-val;
        m=m-val1;
        if(m<0)
            return false;
    }
    return true;
}
}