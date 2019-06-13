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
        ArrayList<Pair> al=new ArrayList<Pair>();
        for(int i=0;i<n;i++)
        {
            Pair p=new Pair(a[i],b[i],a[i]*b[i]);
            al.add(p);
        }
        Collections.sort(al,new Mycomparator());
        int start=0,end=n-1;
        long ans=0;

        while(start<end)
        {
            int mid=(start+end)/2;
            Pair v1=al.get(mid);
            Pair v2=al.get(end);
            if(v2.b==0)
            {
                break;
            }
            long tmp1=v1.p/v2.b;
            long tmp2=v2.a-tmp1;
            if(tmp2<=m)
            {
                end=mid-1;
                long tt=v2.b*tmp1;
                if(tt>ans)
                    ans=tt;
            }
            else
            {
                start=mid+1;
                if(m>v2.a)
                {
                    end=end-1;
                }
                else
                {
                long tt=v2.b*(v2.a-m);
                if(tt>ans)
                    ans=tt;
                }
            }         
        }
System.out.println(ans);
    }
}


    class Pair
{
    long a;
    long b;
    long p;
    Pair(long a,long b,long p)
    {
        this.a=a;
        this.b=b;
        this.p=p;
    }
}

class Mycomparator implements Comparator<Pair>
{
    public int compare(Pair p1,Pair p2)
    {
        int r=0;
        if(p1.p>p2.p)
            r=1;
        else 
        {
            r=-1;
        }
        return r;
    }
}