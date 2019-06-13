import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class kaprekar {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		long p=sc.nextLong();
		long q=sc.nextLong();
		int count=0;
		long a,n,r,d;
		for(long i=p;i<=q;i++)
		{
		a=i*i;
		n=a;
		d=0;
		while(n>0)
		{
		n/=10;
		d++;
		}
		n=a;
		long x,y;
		if(d%2==0)
		{
		 x=(int)(n/(Math.pow(10,d/2)));
		 y=(int)(n%(Math.pow(10,d/2)));
		}
		else
		{
		 x=(int)(n/(Math.pow(10,d/2+1)));
		 y=(int)(n%(Math.pow(10,d/2+1)));
		}
		if((x+y)==i)
		{
		count++;
		System.out.print(i+" ");
		}
		}
		if(count==0)
		System.out.print("INVALID RANGE");
    }
}