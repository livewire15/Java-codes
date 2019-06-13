import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_subarray {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int pf=a[0],profit=0;
		for(int i=1;i<n;i++)
		{
		if(a[i]>pf)
		{
		profit+=a[i]-pf;
		pf=a[i];
		}
		}
		System.out.println(profit);
		}
		}
		}