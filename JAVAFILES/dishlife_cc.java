import java.util.*;
class Main
{
public static void main(String args[])
{
int t,flag=0;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
int n=sc.nextInt();
int k=sc.nextInt();
int b[]=new int[k];
int f=0;
while(f<k)
{
	b[f++]=f+1;
}
for(int j=0;j<n;j++)
{
int s=sc.nextInt();
int a[]=new int[s];
for(int l=0;l<s;l++)
{
a[l]=sc.nextInt();
}

int p;
for(int m=0;m<k;m++)
{
	p=0;
while(p<s)
{
if(b[m]==a[p] && b[m]!=-1)
{
b[m]=-1;
p++;
break;
}
}
p++;
}
if(flag==k && j!=(n-1))
{
System.out.println("sad");
}
}









