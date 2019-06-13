import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class permuting_arrays {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i1=0;i1<t;i1++)
		{
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		b[i]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int p=n-1,count=0;
		for(int j=0;j<n;j++)
		{
		if((a[j]+b[p-j])>=k)
		{
		count++;
		}
		}
		if(count==n)
		System.out.println("YES");
		else
		System.out.println("NO");
		}
		}
}
		