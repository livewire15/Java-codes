import java.io.*;
import java.util.*;

class subarray
{
public static void main(String args[])
{
int k,s,p=0;
Scanner sc=new Scanner(System.in);

int n=sc.nextInt();
int a[]=new int[n];

for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(int j=0;j<n;j++)
{
k=j;s=0;
while(k<n)
{
s=s+a[k];
if(s<0)
p++;
k++;
}
}

System.out.println(p);
}
}