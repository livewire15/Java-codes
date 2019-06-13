import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class luck_balance {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		b[i]=sc.nextInt();
		}
		int t=0,t1=0,luck=0,count=0;
		for(int j=0;j<n;j++)
		{
		for(int k=0;k<n-1;k++)
		{
		if(a[k]<a[k+1])
		{
		t=a[k];
		a[k]=a[k+1];
		a[k+1]=t;
		t1=b[k];
		b[k]=b[k+1];
		b[k+1]=t1;
		}
		}
		}
		
		for(int i=0;i<n;i++)
		{
		if(b[i]==1 && count<l)
		{
		luck+=a[i];
		count++;
		}
		else if(b[i]==1 && count>=l)
		{
		luck-=a[i];
		}
		else
		{
		luck+=a[i];
		}
		}
		System.out.println(luck);
    }
}