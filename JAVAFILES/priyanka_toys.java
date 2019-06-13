import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class priyanka_toys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		int min=a[0],cost=1;
		for(int j=1;j<n;j++)
		{
		if(a[j]<=(min+4))
		{
		continue;
		}
		else
		{
		min=a[j];
		cost=cost+1;
		}
		}
		System.out.println(cost);
    }
}