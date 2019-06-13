import java.io.*;
import java.util.*;

class arraylist
{
public static void main(String args[])
{
int x,y;
Scanner sc=new Scanner(System.in);
int a[][]=new int[20][50];
System.out.println("Enter the size");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
int m=sc.nextInt();
for(int j=1;j<=m;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the no. of queries");
int l=sc.nextInt();
for(int k=0;k<l;k++)
{
x=sc.nextInt();
y=sc.nextInt();
System.out.println(a[x][y]);
}
}
}