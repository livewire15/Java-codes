import java.util.*;
class digits_hackerearth
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
long n=sc.nextLong();
long sum=0;
int i=0;
while(sum<=n)
{
	i=i+1;
sum+=(long)Math.pow(3,i);
if(sum>=n)
{
break;
}
}
System.out.println(i);
t--;
}
}
}