import java.util.*;
import java.util.Arrays;
class maxout
{
public static void main(String args[])
{
int i,j,t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(i=0;i<t;i++)
{
int max=-1;
int n=sc.nextInt();
long a[]=new long[n];
long b[]=new long[n];
for(j=0;j<n;j++)
{
a[j]=sc.nextInt();
b[j]=-1;
}
for(i=0;i<n;i++)
{
Arrays.sort(b);
if(Arrays.binarySearch(b,0,n,a[i])<=0)
{
for(j=i+1;j<n;j++)
{	
if((a[i]%a[j])>max)
max=(int)(a[i]%a[j]);
}
b[i]=a[i];
}
}
System.out.println(max);
}
}
}
