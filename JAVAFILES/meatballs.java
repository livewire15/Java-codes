import java.util.*;
class meatballs
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i1=0;i1<t;i1++)
{
int flag=0,p=0;
int n=sc.nextInt();
int k=sc.nextInt();
int a[]=new int[k];
for(int i=3;i<n;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
a[p++]=i;
if(p==k)
{
flag=1;
break;
}
break;
}
}
if(flag==1)
break;
}

if(flag==1)
{
for(int l=0;l<a.length;l++)
System.out.println(a[l]);
}
else
System.out.println(-1);
}
}
}