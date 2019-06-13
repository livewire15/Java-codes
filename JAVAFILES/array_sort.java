import java.util.*;
class array_sort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String arr[]=new String[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.next();
}
int count=0;
String p="";
for(int i=0;i<n;i++)
{
for(int j=0;j<n-1;j++)
{
if(arr[j].compareTo(arr[j+1])>0)
{
p=arr[j];
arr[j]=arr[j+1];
arr[j+1]=p;
count++;
}
}
}
System.out.println(count);
}
}