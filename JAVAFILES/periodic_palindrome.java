import java.util.*;
class periodic_palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int j=0;j<t;j++)
{
int n=sc.nextInt();
int p=sc.nextInt();
if(p==1 || p==2)
{
System.out.println("impossible");
continue;
}
else
{
String s="";
int i;
if(p%2==0)
{	
for(i=0;i<p/2-1;i++)
	s=s+"a";
s=s+"b";
String rev=new StringBuilder(s).reverse().toString();
s=s+rev;
}
else
{
for(i=0;i<p/2;i++)
	s=s+"a";
s=s+"b"+s;
}
for(int k=0;k<n/p-1;k++)
{
	s=s+s;
}
System.out.println(s);
}
}
}
} 