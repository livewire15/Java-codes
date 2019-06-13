import java.util.*;
class choco_box
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int k=sc.nextInt();
int s=sc.nextInt();
int count=1,flag=0;
if(n%k==0)
{
int days=n/k;
int sum=days;
if(days%6==0 && days<s)
{
flag=-1;
}
else if(n<k || (n==k && s>6))
{
	flag=-1;
}
else if(sum<s)
{
while(sum<s)
{
count++;
sum=sum+days;
}
}
}
else
{
int days=0;
int div=n/k;
days=div;
int rem=n%k;
int sum=0;
sum+=rem;
while(days<s)
{
if(days%6==0 && sum<k)
{
flag=-1;
break;
}
else
{
sum+=rem;
days+=div;
count++;
}
}
}
if(flag==-1)
System.out.println(-1);
else
System.out.println(count);
t--;
}
}
}