import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class recursive_digit_sum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
	   String s=sc.next();
		int k=sc.nextInt();
		long sum=0;
		
		for(int i=0;i<s.length();i++)
		{
			sum=sum+s.charAt(i)-48;
		}
		sum=sum*k;
		if(sum%9==0)
			System.out.println(9);
		else
			System.out.println(sum%9);
	}
		}
		