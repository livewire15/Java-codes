import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class maxgcd_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
		long a[]=new long[n];
		long b[]=new long[n];
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextLong();
		}
		for(int j=0;j<n;j++)
		{
		b[j]=sc.nextLong();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long arr[]=new long[1000000];
		long arr1[]=new long[1000000];
		Arrays.fill(arr,0);
		
		BigInteger max=BigInteger.valueOf(0);
		BigInteger sum=BigInteger.valueOf(0);
		for(int i=n-1;i>=0;i--)
		{
			Arrays.fill(arr,0);
			if(arr[i]==0)
			{
		BigInteger b1=BigInteger.valueOf(a[i]);
		arr[i]=1;
		for(int j=n-1;j>=0;j--)
		{
			if(arr1[j]==0)
			{
		arr1[j]=1;
		BigInteger b3;
		BigInteger b2=BigInteger.valueOf(b[j]);
		b3=b1.gcd(b2);
		
		if(b1.compareTo(max)<0)
			break;
		if(max.compareTo(b1)==0)
			break;
		
		if(b3.compareTo(max) > 0)
		{
		sum=b1.add(b2);
		max=b3;
		}
		else if(b3.compareTo(max)==0)
		{
		if((b1.add(b2)).compareTo(sum)>0)
		sum=b1.add(b2);
		}
		
		}
		}
		}
		}
		System.out.println(sum);
		}
		}