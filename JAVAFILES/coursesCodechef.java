import java.util.*;
class coursesCodechef
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int c;
String s="";
for(int i1=0;i1<t;i1++)
{
int n=sc.nextInt();
for(int j=0;j<n;j++)
{
c=sc.nextInt();
s=s+(char)c;
}

int p,x=0;

for(int i=1;i<=n;i++)
{
	p=0;
	if(s.length()>0)
{
for(int j=0;j<s.length();j++)
{
if(i==s.charAt(j))
{
s=s.replaceAll("s.charAt(j)","");
p=1;
break;
}
}
if(p==0)
{
x++;
}
}
else
{
	x=n-(i-1);
	break;
}
}
System.out.println(x);
}
}
}


