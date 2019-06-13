import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class whats_name {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
		sc.nextLine(); 
		for(int i=0;i<t;i++)
		{
		String s=sc.nextLine();
		s.trim();
		String s1="", s2="",s3="",ch1="";		
		for(int j=0;j<s.length();j++)
		{
			char ch=s.charAt(j);
			if(ch==' ')
			{
				 ch1=Character.toString(Character.toUpperCase(s1.charAt(0)));
				 s2=ch1+".";
				 s3=s3+s2+" ";
				s2="";
				s1="";
			}
			else
			{
				s1=s1+ch;
			}
		}
		
		String s4=Character.toString(Character.toUpperCase(s1.charAt(0)));
		String s5=s1.substring(1,s1.length());
		s5=s5.toLowerCase();
		String s6=s4+s5;
		System.out.println(s3+s6);
		}
		}
		}