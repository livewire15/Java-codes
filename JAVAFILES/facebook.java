import java.util.*;
import java.io.*;
class facebook
{
public static void main(String args[])throws FileNotFoundException
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();



for(int j=1;j<=t;j++)
{
int n=sc.nextInt();
int k=sc.nextInt();
long v=sc.nextLong();
String arr[]=new String[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.next();
}
int ans=(int)(((long)(long)k*v)%(long)n);
String op1="",op2="";
int count=0,flag=0;
while(count<k)
{
if(ans==0)
{
	ans=n-1;
	flag=1;
}
else
{
	ans=ans-1;
}
if(flag==0)
{	
op1=arr[ans]+" "+op1;
}
else
{
	op2=arr[ans]+" "+op2;
}
count++;
}
System.out.println("Case #"+j+": "+op1+op2);
}
}
}