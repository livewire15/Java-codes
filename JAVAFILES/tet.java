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
        PriorityQueue<Pair> pq=new PriorityQueue<Pair>(new Mycomparator());
        for(int i=0;i<n;i++)
        {
            Pair p=new Pair(a[i],b[i],a[i]*b[i]);
            pq.add(p);
        }
        int f=0;
        while(m>0)
        {
            Pair p1=pq.poll();
            Pair p2=pq.peek();
            if(p1.b==0)
            {
                f=1;
                break;
            }
            long tmp=p2.p/p1.b;

            if(p2.p%p1.b==0)
                tmp=tmp-1;
            long tmp2=p1.a-tmp;
            if(m<tmp2)
            {
                tmp=p1.a-m;
                tmp2=m;
            }
            m=m-tmp2;
            
            Pair pp=new Pair(tmp,p1.b,tmp*p1.b);
            pq.add(pp);

        }
        long ans=0;
        if(f==0)
            ans=pq.poll().p;
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
        if(p2.p>p1.p)
            r=1;
        else 
        {
            r=-1;
        }
        return r;
    }
}