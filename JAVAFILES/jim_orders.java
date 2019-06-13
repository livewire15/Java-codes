import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jim_orders {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
		}
		int c[]=new int[n];
		int d[]=new int[n];
		int p=1,t=0,t1=0;
		for(int j=0;j<n;j++)
		{
		c[j]=a[j]+b[j];
		d[j]=p++;
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<(n-1);j++)
		{
		if(c[j]>c[j+1])
		{
			t=c[j];
			c[j]=c[j+1];
			c[j+1]=t;
		t1=d[j];
		d[j]=d[j+1];
		d[j+1]=t1;
		}
		}
		}
		int i=0;
		while(i<d.length)
		{
		System.out.print(d[i]+" ");
		i++;
		}
	}
}