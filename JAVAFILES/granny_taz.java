
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class granny_taz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int flag=0;
		int a[]=new int[10];
		Arrays.fill(a,0);
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(Character.isDigit(ch)==true)
		{
			flag=1;
			if(a[Character.getNumericValue(ch)]==0)
			{
		s1=s1+ch;
		a[Character.getNumericValue(ch)]=1;
		}
		}
		}
		String s2="";
		char ch;
		if(flag==1)
		{
		for(int i=9;i>=0;i--)
		{
			for(int l=0;l<s1.length();l++)
			{
				 ch=s1.charAt(l);
			if(Character.getNumericValue(ch)==i)
			{
				 s2=s2+ch;
				 break;
			}
		}
		}
		s2.trim();
		System.out.println(Integer.parseInt(s2));
		}
		else
			System.out.println(-1);
	}
	}
}