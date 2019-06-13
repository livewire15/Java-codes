import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class chef_sign {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		int flag=0,count=1;
		String s=sc.next();
		char ch1=s.charAt(0);
		if(ch1=='<')
		{
		count+=1;
		flag=1;
		}
		else if(ch1=='>')
		{
		count+=1;
		flag=2;
		}
		else
		{
	     flag=3;
		}
		
		int j=1;
		while(j<s.length())
		{
		char ch=s.charAt(j);
		if(ch=='<')
		{
		if(flag==1)
		{
		count+=1;
		}
		else if(flag==2)
		{
		;
		}
		else if(flag==3)
		{
		count+=1;
		}
		flag=1;
		}
		else if(ch=='>')
		{
		if(flag==1)
		{
		;
		}
		else if(flag==2)
		{
		count+=1;
		}
		else if(flag==3)
		{
		count+=1;
		}
		flag=2;
		}
		else
		{
		if(flag==1)
		{
		;
		}
		else if(flag==2)
		{
		;
		}
		else if(flag==3)
		{
		;
		}
		}
		j++;
		}
		System.out.println(count);
		}
		}
 }