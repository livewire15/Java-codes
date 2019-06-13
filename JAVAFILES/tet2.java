import java.util.*;
import java.util.HashMap;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	long n=sc.nextLong();
        long d=sc.nextLong();
        long n1=n;
        HashMap<Long,Long> map=new HashMap<Long,Long>();
        long min=Long.MAX_VALUE;
        while(true)
        {
            long rem=n%9;
            if(rem==0)
                rem=9;
            if(rem<min)
                min=rem;
            if(!map.containsKey(rem))
            {
                map.put(rem,n);
            }
            else
            {
                break;
            }
            n=n+d;
        }
        long op=fun(n1,0,min,d,0);
        System.out.println(min+" "+op);
    }
}
        public static long fun(long num,long op,long min,long d,long p)
        {
            if(p>20)
                return Long.MAX_VALUE;
            if(num==min)
            {
                return op;
            }
            long op1=fun(num+d,op+1,min,d,p+1);
            Pair obj=isDigit(num);
            long op2=fun(obj.val,op+obj.op,min,d,p+1);
            return Math.min(op1,op2);
        }

        public static Pair isDigit(long numc)
        {
            long s=0,tmp=0;
            if(numc>9)
            {
                tmp=tmp+1;
                while(numc>0)
                {
                    long r=numc%10;
                    s=s+r;
                    numc/=10;
                }
                numc=s;
            }
            Pair obj=new Pair(numc,tmp);
            return obj;
        }
    }

class Pair
{
    long val,op;
    Pair(long val,long op)
    {
        this.val=val;
        this.op=op;
    }
}