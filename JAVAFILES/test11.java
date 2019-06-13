import java.util.*;
class test11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int a=sc.nextInt();
int b=sc.nextInt();
if(a==b)
System.out.println(2*a);
else if(a>b)
{
int ans=a%b;
if(ans==0)
System.out.println(a);
else
System.out.println(ans*2);
}
else
{
int ans=b%a;
if(ans==0)
System.out.println(b);
else
System.out.println(ans*2);
}
t--;
}
}
}