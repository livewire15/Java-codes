import java.util.*;
class Main 
{    
 public static void main(String[] args)
 { 
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
    	int n=sc.nextInt();
        long b=0,n1=0,b1=0;
        int val=n/26;
        int rem=n%26;
        if(rem==0)
        {
            b1=(long)Math.pow(2,val-1);
        }
        else if(rem<3)
        {
            b=(long)Math.pow(2,val);
        }
        else if(rem<11)
        {
            n1=(long)Math.pow(2,val);
        }
        else
        {
            b1=(long)Math.pow(2,val);
        }
        System.out.println(b+" "+n1+" "+b1);
    }
}
}