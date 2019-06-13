/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only  */
 class shiv
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
		 Arrays.sort(arr);
		 int i=n-1;
		 long c=0;
		 while(i>=0)
		 {
		     
		     if(i==(n-1))
		     	{
		          c=arr[i];
		          System.out.print(c+" ");
		          i--;
		     	}
		     else
		     	{
		        	 if(c!=(arr[i]))
		        		 {
		        		     c=arr[i];
		        		     System.out.print(c+" ");
		        		 }
		        	 i--;
		     	}
		}
	}
}
