import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test36 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		prime();
		int n=sc.nextInt();
		while(n>0)
		{
		String s=sc.next();
		String arr[]=s.split(",");
		int a1=Integer.parseInt(arr[0]);
		int a2=Integer.parseInt(arr[1]);
		System.out.println(a1+" "+a2);
		int val=fun1(a1,a2);

		System.out.println(fun2(val));
		n--;
		}
	}

	static boolean prime1[] = new boolean[1000001];
      public static void prime()
    {
        for(int i=0;i<1000001;i++)
            prime1[i] = true;
         
        for(int j = 2; j*j <=1000000; j++)
        {
            if(prime1[j] == true)
            {
                for(int i = j*2; i <= 1000000; i += j)
                    prime1[i] = false;
            }
        }
    }

	static int fun1(int x,int y)
	{
		int c1=1,c2=2,f=1;
		int val1=0,val2=0,num=0;
		for(num=2;val1!=x|| val2!=y;num++,c1++)
		{
			if(c1<=c2)
			{
				val2+=f;
			}
			else if(c1<=0.5*c2)
				val1+=f;

			if(c1==c2)
			{
				f*=-1;
				c2+=2;
				c1=0;
			}	
		}
		return (num-1);
	}

	static int fun2(int total)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		int f=0;
		int i=0;
		int j=0;	
		for(i=3;al.size()<total;i++)
		{
			if(prime1[i])
				al.add(i);
		}
		int n1=al.size();
		return al.get(n1-1);
	}
	}
