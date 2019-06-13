/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only  */
public class pokemon_ditto
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,sum=0,diff=0;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int flag=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int j=0;j<n;j++)
		{
		a[j]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
		b[j]=sc.nextInt();
		}
		
		for(int k=0;k<n-1;k++)
		{
		if(a[k]!=b[k])
		{
		if(a[k]>b[k])
		{
	     diff=a[k]-b[k];
		a[k]=a[k]-diff;
		a[k+1]=a[k+1]+diff;
		}
		else
		{
			sum=b[k]-a[k];
		a[k]=a[k]+sum;;
		a[k+1]=a[k+1]-sum;
		}
		}
		}
       if(a[n-1]==b[n-1])
	   { 
        flag=1;
	   }
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		}
		}
		}
		