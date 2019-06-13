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
		for(int k=0;k<t;k++)
		{
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=0,max=0,max1=0,flag=0,nmax=-10001,s1=0;
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		if(a[i]>0)//checking for positive
		flag=1;
		}
		
		if(flag==1)//if elements are positive.
		{
		for(int i=0;i<n;i++)
		{
			if(a[i]>0)
				s1=s1+a[i];  //non-contiguous sum of only +ve elements
			
			s=s+a[i]; //max sum for contigious subarray
			if(s>max)
				max=s;
			if(s<0)   						//checking if sum<0 coz if sum has gone -ve then re-initialize the sum=0 and begin searching for new subarray
												//from the next consecutive element.
			s=0;
		}
				
		/*if(a[i]>max1)
		{
			max1=a[i];
			s=s+a[i];
			if(s>max)
			{
				max=s;
			}
		}
		}
		int c=(max>max1)?max:max1;*/
		System.out.println(max+" "+s1);
		}
		
		else//if elements are negative.
		{
		for(int i=0;i<n;i++)
		{
		if(a[i]>nmax)
		nmax=a[i];
		}
		System.out.println(nmax+" "+nmax);
		}
		
		}
	}
}
