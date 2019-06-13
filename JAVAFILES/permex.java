import java.util.*;
class permex
{
public static void main(String args[])
{
int t,flag=0,p;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
int n=sc.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
for(int k=j+1;k<n;k++)
{
if(a[j]>a[k])
{
p=a[j];
a[j]=a[k];
a[k]=p;
}
}
}
for(int j=0;j<(n-1);j++)
{
if(a[j+1]-a[j]>1)
{
flag=-1;
break;
}
}
if(flag==0)
System.out.println("YES");
else
System.out.println("NO");
}
}
}