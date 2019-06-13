import java.util.*;
class sad_queries
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int arr[][]=new int[k][];
int j=0;
for(int i=0;i<k;i++)
{
int n=sc.nextInt();
arr[i]=new int[n];
 j=0;
while(j<n)
{
arr[i][j]=sc.nextInt();
j++;
}
}
int m=sc.nextInt();
for(j=0;j<m;j++)
{
int i1=sc.nextInt();
int j1=sc.nextInt();
i1--;
j1--;
long sum=0;
for(int a1=0;a1<arr[i1].length;a1++)
{
for(int a2=0;a2<arr[j1].length;a2++)
{
sum+=Math.abs(arr[i1][a1]-arr[j1][a2]);
}
}
System.out.println(sum);
}
}
}