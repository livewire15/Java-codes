import java.util.*;
class max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int i=0,j=0;
while(t>0)
{
int n=sc.nextInt();
int arr[][]=new int[n][n];
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
}
}

int max=0,x=0;
long sum=0;
for(j=0;j<n;j++)
{
if(arr[n-1][j]>max)
max=arr[n-1][j];
}
sum+=max;


for(i=n-2;i>=0;i--)
{
	int flag=0;
	int val=1000000000;
for(j=0;j<n;j++)
{
if(arr[i][j]<max && (max-arr[i][j])<val)
{
	flag=1;
val=max-arr[i][j];
x=arr[i][j];
}
}
if(flag==0)
{
	sum=-1;
	break;
}
sum+=x;
max=x;
}
System.out.println(sum);
t--;
}
}
}
