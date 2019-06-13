import java.util.*;
import java.math.*;
 class Bigmultiply
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		String m=sc.next();
		String n=sc.next();
		long s1=0,s2=0;
		for(int i=0;i<m.length();i++)
		{
			s1=s1+(int)m.charAt(i)-48;
		}
		for(int i=0;i<n.length();i++)
		{
			s2=s2+(int)n.charAt(i)-48;
		}
		//System.out.println(s1+" "+s2);
		System.out.println((long)(s1*s2)%3);
		t--;
		}
		}
		}