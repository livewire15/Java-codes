import java.util.*;
class pythagoras
{
public static void main(String args[])
{
int p=0;
long a,b=0,c=0;
Scanner sc=new Scanner(System.in);
a=sc.nextLong();
if(a>7)
{
for(long i=5;i<=a;i=i+1)
{
if(Math.sqrt(i*i+a*a)==(long)Math.sqrt(i*i+a*a))
{
p=1;
b=i;
System.out.println(a+" "+b+" "+(long)Math.sqrt(i*i+a*a));

break;
}
}
if(p==0)
{
for(long i=a+1;i<1000000000;i=i+1)
{
if(Math.sqrt(i*i+a*a)==(long)Math.sqrt(i*i+a*a))
{
p=1;
b=i;
System.out.println(a+" "+b+" "+(long)Math.sqrt(i*i+a*a));

break;
}
}
}
}
else
{
for(long i=a+1;i<1000000000;i=i+1)
{
if(Math.sqrt(i*i+a*a)==(long)Math.sqrt(i*i+a*a))
{
	b=i;
System.out.println(a+" "+b+" "+(long)Math.sqrt(i*i+a*a));

break;
}
}
}
}
}