import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class power_sum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(findpowersum(x,n,1));
	}
	
	static int findpowersum(int total,int power,int num)
	{
	int value=total-(int)Math.pow(num,power);
	if(value==0)
	return 1;
	else if(value<0)
	return 0;
	else
	{
	return findpowersum(value,power,num+1)+findpowersum(total,power,num+1);
	}
	}
	}
		