import java.util.*;
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
int sum=0,count=2;
for(int i=n-2;i>0;i--)
{
sum=arr[i]+arr[i-1];
if(sum<maxsum)
{
break;
}
else
count++;
}

int pi=0,pn=0;
pi=count*(count-1)/2;
pn=n*(n-1)/2;
System.out.printf("%.8f\n",pi/pn);
t--;
}
}
}
