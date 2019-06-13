import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class book_fair {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		int max=0;
		k=k+1;
		for(int i=0;i<n;i++)
		{
			int sum=0;
		for(int j=i;j<n;j=j+k)
		{
		sum=sum+a[j];
		}
		if(sum>max)
		max=sum;
		}
		System.out.println(max);
    }
}
