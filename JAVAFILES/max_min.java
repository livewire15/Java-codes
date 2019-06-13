import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class max_min {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		int first=0;
		int last=k-1;
		long min=1000000001;
while(last<n)
{
	if(a[last]-a[first]<min)
		min=a[last]-a[first];
	first++;
	last++;
}
System.out.println(min);
		}
		}