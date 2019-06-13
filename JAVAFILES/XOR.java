import java.util.*;
class XOR
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
long b[]=new long[n];
long sum=0;
for(int i=0;i<n;i++)
{
b[i]=arr[i]+arr[i];
sum=sum^b[i];
}
System.out.println(sum);
t--;
}
}
}