import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class largest_per {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
	
		int x=0,max=n,t;//max=n..since array elements are permutataion of first n natural no.s.
		while(k>0 && x<n)
		{
		for(int i=x;i<n;i++)
		{
		if(a[i]==max)//if max element is caught then swap
		{
		t=a[i];
		a[i]=a[x];
		a[x]=t;
		if(i!=x)//but if element is caught at first place only then do not decrease the swap "K swaps".
		{
		k--;
		}
		max--;//since array elements are in permutataion from higher element to lower.
		x++;
		break;
		}
		else 
		continue;
		}
		}
		for(int j=0;j<n;j++)
		{
		System.out.print(a[j]+" ");
		}
    }
}