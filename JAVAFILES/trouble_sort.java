import java.util.*;
class trouble_sort
{
public static calc()
{
int t=in.nextInt();
for(int i=1;i<=t;i++)
{
int n=in.nextInt();
long arr[]=in.nextLongArray(n);
int n1=0,n2=0;
if(n%2==0)
{
n1=n/2; //odd
n2=n/2; //even
}
else
{
n1=n/2; //odd
n2=n/2+1; //even
}
long arr1[]=new long[n1];//odd
long arr2[]=new long[n2];//even

int k1=0,k2=0;
for(int i=0;i<n;i++)
{
if(i%2==0)
{
arr2[k2++]=arr[i];
}
else
{
arr1[k1++]=arr[i];
}
}
Arrays.sort(arr1);
Arrays.sort(arr2);
k1=0;
k2=0;
for(int m=0;m<n;m++)
{
if(m%2==0)
{
arr[m]=arr2[k1++];
}
else
{
arr[m]=arr1[k2++];
}
}
int flag=0,pos=0;
for(int m=0;m<(n-1);m++)
{
if(arr[m]>arr[m+1])
{
flag=-1;
pos=m;
}
}
if(flag==0)
out.println("Case #"+j+":"+" "+"OK");
else
out.println("Case #"+j+":"+" "+pos);
}
}
}