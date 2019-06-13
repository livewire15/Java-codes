import java.util.*;
class permex1
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
	int flag=0;
int n=sc.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
{
a[j]=sc.nextInt();
}
Arrays.sort(a);
for(int j=0;j<(n-1);j++)
{
if((a[j+1]-a[j])<=1)
;
else
{
	flag=1;
break;
}
}
if(flag==0)
System.out.println("YES");
else
System.out.println("NO");
}
}
}