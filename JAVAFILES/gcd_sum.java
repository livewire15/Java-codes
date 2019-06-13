import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class gcd_sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		long x=sc.nextInt();
		long y=sc.nextInt();
		BigInteger s=BigInteger.valueOf(0);
		for(long j=x;j<y;j++)
		{
		for(long k=j+1;k<=y;k++)
		{
		BigInteger b3;
		BigInteger b1=BigInteger.valueOf(j);
		BigInteger b2=BigInteger.valueOf(k);
		b3=b1.gcd(b2);
		s=s.add(b3);
		}
		}
		System.out.println(s);
		}
		}
		}
		