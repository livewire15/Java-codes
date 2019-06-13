import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class candies {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int flag=0;
		int p=0,count=1;
		
		for(int i=0;i<n;i++)
		{
		if(a[i]<a[i+1])
		{
			b[i]=1;
			p=p+1;
		}
		else if(a[i]==a[i+1])
		{
			if(a[i]<a[i+2])
			{
				b[i]=2;
				p=p+2;
			}
			else if(a[i]>=a[i+2])
			{
				b[i]=1;
				p=p+1;
			}		
		}
		else
		{
		    count++;
			p=p+count;
		}	
		}
		}
    }

