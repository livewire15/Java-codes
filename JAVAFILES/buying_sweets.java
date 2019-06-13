import java.util.*;
class buying_sweets
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
int sum=0,flag=0;
int n=sc.nextInt();
int a[]=new int[n];
int x=sc.nextInt();
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
sum+=a[j];
}
int p=sum/x;
for(int j=0;j<n;j++)
{
if((sum-a[j])/x==p)
{
flag=1;
break;
}
else
continue;
}
if(flag==0)
{
System.out.println(p);
}
else
System.out.println(-1);
}
}
}