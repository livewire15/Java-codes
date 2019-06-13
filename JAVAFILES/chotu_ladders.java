import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class chotu_ladders {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int count=0;
		int n=sc.nextInt();
		int a[]=new int[n];
		int m=sc.nextInt();
		int b[]=new int[m];
		int k=sc.nextInt();
		for(int j=0;j<n;j++)
		{
		a[j]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
		b[j]=sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int j=n-1;j>=0;j--)
		{
		for(int l=m-1;l>=0;l--)
		{
		if(a[j]+b[l]>=k)
		count++;
		else 
		break;
		}
		}
		System.out.println(count);
		}
		}
}