import java.util.*;
class cupcakes
{
public static void main(String args[])
{
int t,p;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
int min=100000001;
int n=sc.nextInt();
for(int j=1;j<=(int)Math.sqrt(n);j++)
{
if(n%j==0)
{
p=n/j;
if(Math.abs(p-j)<min)
min=p-j;
}
}
System.out.println(min);
}
}
}