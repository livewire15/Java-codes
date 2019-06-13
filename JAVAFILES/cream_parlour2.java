import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class cream_parlour2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int j=0,k=0,flag=0;
		int m=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int j1=0;j1<n;j1++)
		{
			a[j1]=sc.nextInt();
		}
		
		for(j=0;j<n-1;j++)
		{
		for(k=j+1;k<n;k++)
		{
		if((a[j]+a[k])==m)
		{
		flag=1;
		break;
		}
		}
		if(flag==1)
		break;
		}
		j++;
		k++;
		if(flag==1)
		{
		if(j>=k)
		System.out.println(k+" "+j);
		else
		System.out.println(j+" "+k);
		}
		}
		}
		}