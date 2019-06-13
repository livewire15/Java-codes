import java.util.*;
import java.text.DecimalFormat;
class random_pair
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
Arrays.sort(arr);
int maxsum=arr[n-1]+arr[n-2];
int count=0;
float pi=0,pn=0;
if(arr[n-1]==arr[n-2])
{
	count=2;
for(int i=n-3;i>=0;i--)
{
if(arr[i]!=arr[n-2])
{
break;
}
else
count++;
}
pi=count*(count-1)/2;
pn=n*(n-1)/2;
}
else
{
	count=1;
for(int i=n-3;i>=0;i--)
{
if(arr[i]!=arr[n-2])
{
break;
}
else
count++;
}
pi=count;
pn=n*(n-1)/2;
}
DecimalFormat df=new DecimalFormat("0.00000000");
System.out.println(df.format(pi/pn));
t--;
}
}
}
