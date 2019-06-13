import java.io.*;
import java.util.*;
class sum3
{
public static void main(String args[])
{
int n,s1=0,s2=0,s3=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of n");
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}

for(int j=0;j<n;j+=3)
{
s1=s1+a[j];
}
for(int k=1;k<n;k+=3)
{
s2=s2+a[k];
}
for(int l=2;l<n;l+=3)
{
s3=s3+a[l];
}
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
}
}