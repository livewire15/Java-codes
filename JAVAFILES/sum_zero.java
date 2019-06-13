import java.util.*;
class sum_zero
{
public static void main(String args[])
{
int n,s=0,s1,p=0,j,flag=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
s=s+a[i];
}

for(j=0;j<n;j++)
{
s1=s;
p=a[j]*(-1);
s1=s1+p+p;
if(s1==0)
{ 
    flag=1;
    break;
}
}	
	
if(flag==1)
System.out.print(j);
else
System.out.print(-1);
}
}