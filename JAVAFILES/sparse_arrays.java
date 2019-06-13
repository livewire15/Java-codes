import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class sparse_arrays{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.next();
		}
		int q=sc.nextInt();
		String query[]=new String[q];
		for(int i=0;i<q;i++)
		query[i]=sc.next();
		
		for(int j=0;j<q;j++)
		{
		int count=0;
		for(int k=0;k<n;k++)
		{
		if(query[j].equals(a[k]))
		count++;
		}
		System.out.println(count);
		}
    }
}