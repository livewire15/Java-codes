import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class fibo_mod {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		int n=sc.nextInt();
		int p=3;
		BigInteger a=BigInteger.valueOf(t1);
		BigInteger b=BigInteger.valueOf(t2);
		BigInteger c=BigInteger.valueOf(0);
		while(p<=n)
		{
		c=a.add(b.multiply(b));
		a=b;
		b=c;
		p++;
		}
		System.out.println(c);
    }
}

