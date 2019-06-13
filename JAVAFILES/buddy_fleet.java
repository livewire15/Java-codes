import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class buddy_fleet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		int count=0,count1=0,temp;
		for(int j=0;j<m;j++)
		{
		int x=sc.nextInt();
		int y=sc.nextInt();
		x--;
		y--;
		for(int l=x;l<=y;l++)
		{
		a[l]=a[l]+k;
		}
		}
		
		while(count1!=(n-1))
		{
			count1=0;
		for(int j=0;j<(n-1);j++)
		{
		if(a[j]>a[j+1])
		{
		temp=a[j];
		a[j]=a[j+1];
		a[j+1]=temp;
		count++;
		}
		else
			count1++;
		}
		}
		System.out.println(count);
		}
		}
		}