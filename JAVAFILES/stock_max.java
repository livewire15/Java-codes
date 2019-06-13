import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class stock_max {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int pf=0;
		long profit=0;
		for(int i=n-1;i>=0;i--)//loop is started from end since share price will be maximum at the end,hence profit will be maximum.
		{
		if(a[i]>pf)
		{
		pf=a[i];
		}
		profit+=pf-a[i];
		}
		System.out.println(profit);
		}
		}
		}