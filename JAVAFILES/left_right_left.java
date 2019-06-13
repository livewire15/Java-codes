import java.util.*;
class left_right_left
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
int n=sc.nextInt();
long r=sc.nextLong();
long arr[]=new long[n];
for(int j=0;j<n;j++)
{
arr[j]=sc.nextLong();
}
long min1=0;long min=1000000000;
 
for(int j=0;j<n;j++)
{
int flag=0;
if(arr[j]<r && arr[j]>min1 && arr[j]<min)
{
flag=1;
min1=arr[j];
}
else if(arr[j]>r && arr[j]<min && arr[j]>min1)
{
flag=1;
min=arr[j];
}
else if(arr[j]==r)
{
System.out.println("YES");
break;
}
 
if(flag==0)
{
System.out.println("NO");
break;
}
}
}
}
}
