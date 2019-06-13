import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class angry_children {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		int k= sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextLong();
		}
		Arrays.sort(a);
		k=k-1;
		long min=10000000001,s;
		for(int i=0;(i+k)<n;i++)
		{
		s=0;
		int flag=0;
		int pos1=i;
		int pos2=i+k;//two pointers
		for(int j=pos1;j<pos2;j++)
		{
		for(int l=j+1;l<=pos2;l++)
		{
		s=s+Math.abs(a[j]-a[l]);
		if(s>=min)
		{
			flag=1;
			break;
		}
		}
		if(flag==1)
			break;
		}
		if(s<min)
		min=s;
		}
		System.out.println(min);
		}
		}