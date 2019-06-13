import java.util.*;
class templeland_cc
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
	int flag=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
if(n%2!=0 && a[0]==1)
{
int p=(int)Math.floor((double)(n/2));
for(int k=0;k<p;k++)
{
if((a[k]+1)!=a[k+1])
{
flag=-1;
break;
}
}
if(flag==0)
{
for(int k=p;k<(n-1);k++)
{
if((a[k]-1)!=a[k+1])
{
flag=-1;
break;
}
}
}
if(flag==-1)
System.out.println("no");
else
System.out.println("yes");
}
else
System.out.println("no");
}
}
}