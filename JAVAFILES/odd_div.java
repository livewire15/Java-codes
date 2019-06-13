import java.util.*;
class odd_div
{
    public static void main(String args[])
    {
        int t,a,b;
		double n,s=0.0;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
		s=0;
            a=sc.nextInt();
            b=sc.nextInt();
            for(int j=a;j<=b;j++)
            {
                if(j%2!=0)
				s=s+j;
				else
				{
				n=Math.floor(Math.sqrt(j));
				while((n%2)==0)
				{
				n=Math.floor(Math.sqrt(n));
				}
				s=s+n; 
				}
            }
		System.out.println(s);
		}
    }
}