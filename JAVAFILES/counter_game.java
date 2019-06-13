import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class counter_game {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int p=0;
		int n=sc.nextInt();
		while(n>1)
		{
			if(n==2)
			{
				n=1;
			}
		else if(Math.sqrt(n)==(int)Math.sqrt(n))
		{
		n=n-n/2;
		}
		else
		{
		n=n-(int)Math.pow(2,Math.floor(Math.sqrt(n)));
		}
		p++;
		System.out.println(n);
		}
		if(p%2==0)
		System.out.println("Richard");
		else
		System.out.println("Louise");
		}
    }
}