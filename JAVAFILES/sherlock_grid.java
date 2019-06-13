import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class sherlock_grid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		Arrays.fill(arr,0);
		int count=0;
		String a[]=new String[n];
		for(int j=0;j<n;j++)
		{
		a[j]=sc.next();
		}
		
		for(int j=n-1;j>=0;j--)
		{
		String s=a[j];
		if(j==(n-1))
		{
		for(int k=s.length()-1;k>=0;k--)
		{
		int flag=0;
		if(s.charAt(k)=='.')
		{
		arr[k]=1;
		int l=k+1;
		while(l<s.length())
		{
		if(s.charAt(l)=='.')
		{
		l++;
		continue;
		}
		else
		{
		flag=1;
		break;
		}
		}
		if(flag==0)
		{
		count++;
		}
		}
		else
		{
		continue;
		}
		}
		}
		
		else
		{
		for(int k=s.length()-1;k>=0;k--)
		{
		int flag=0;
		if(s.charAt(k)=='.' && arr[k]==1)
		{
		int l=k+1;
		while(l<s.length())
		{
		if(s.charAt(l)=='.')
		{
		l++;
		continue;
		}
		else
		{
		flag=1;
		break;
		}
		}
		if(flag==0)
		{
		arr[k]=1;
		count++;
		}
		}
		else
		{
		if(s.charAt(k)=='#')
		{
		arr[k]=0;
		continue;
		}
		}
		}
		}
		}//end of for loop
		System.out.println(count);
		}
		}
		}