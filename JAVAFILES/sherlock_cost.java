import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sherlock_cost {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int s=0,flag=0;
		for(int i1=0;i1<t;i1++)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		b[i]=sc.nextInt();
		}
		int j=0;
		for(j=0;j<(n-1);j++)
		{
			if(j==0)
			{
		if(b[j]>b[j+1])
		{
		a[j]=b[j];
		flag=1;
		}
		else
		{
		a[j]=1;
		flag=0;
		} 
		}
		else
		{
		if(flag==0)
			{
		a[j]=b[j];
		flag=1;
		}
		else
		{
		a[j]=1;
		flag=0;
		}
		}
		}
		
		if(flag==1)
		{
		a[j]=1;
		}
		else
		a[j]=b[j];
	
		for(j=1;j<n;j++)
		{
		s=s+Math.abs(a[j]-a[j-1]);
		}
		System.out.println(s);
		}
		}
}
