import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class greedy_florist {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[k];
		Arrays.fill(b,0);
		long cost=0;
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		n=n-1;
		while(n>=0)
		{
		int ptr=0;
		while(ptr<k && n>=0)
		{
		cost+=(b[ptr]+1)*a[n];
		b[ptr]=b[ptr]+1;
		n--;
		ptr++;
		}
		}
		System.out.println(cost);
		}
		}
		