import java.util.*;
class gcd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
boolean prime[]=new boolean[50001];
Arrays.fill(prime,true);
for(int i=2;i*i<=50000;i++)
{
if(prime[i]==true)
{
for(int j=2*i;j<=50000;j=j+i)
{
prime[j]=false;
}
}
}

while(t>0)
{
int n=sc.nextInt();
int arr[]=new int[n];
int flag=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
if(arr[i]==1)
	flag=1;
}
if(flag==1)
	System.out.println(0);
else
{
int count=0,num=0;
for(int j=0;j<n;j++)
{
if(prime[arr[j]])
{
count++;
num=arr[j];
}
}

if(count>1)
	System.out.println(0);
else if(count==1)
{
	int point=0;
	for(int j=0;j<n;j++)
	{
		if(arr[j]%num!=0)
		{
			System.out.println(0);
			break;
		}
		else
			point++;
	}
	if(point==n)
		System.out.println(-1);
}
else
{
	Arrays.sort(arr);
	num=arr[0];
	int point=0;
	flag=0;
	for(int j=2;j<=num;j++)
	{
		point=0;
		for(int k=0;k<n;k++)
		{
			if(arr[k]%j==0)
			{
				point++;
			}
		}
		if(point==n)
		{
			flag=1;
			System.out.println(-1);
			break;
		}
	}
	if(flag==0)
		System.out.println(0);
}
}
t--;
}
}
}