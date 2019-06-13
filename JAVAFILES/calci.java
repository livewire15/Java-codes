import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class calci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int n=sc.nextInt();
		int b=sc.nextInt();
		int energy1=0,energy2=0;
		int rem=n,e2,max=0;
		if(n/b>=2)
		{
		while(rem>0)
		{
		energy1+=b;
		rem=rem-b;
		e2=rem/b;
		energy2=energy1*e2;
		if(energy2>max)
			max=energy2;
		}
		System.out.println(max);
		}
		else
		{
		energy1+=rem-b;
		energy2=energy1;
		System.out.println(energy2);
		}
		}
		}
		}