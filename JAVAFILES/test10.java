import java.util.*;
class test10
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int arr[]=new int[10];
int arr2[]=new int[101];
Arrays.fill(arr,0);
Arrays.fill(arr2,0);
for(int i=0;i<n;i++)
{
int val=sc.nextInt();
if(val<10)
arr[val]=1;
else
arr2[val]=1;
}

int k=9;
String str="";
while(k>=1)
{
if(arr[k]==1)
str+=Integer.valueOf(k);
int p=k*10+9;
while(p>((k-1)*10)+9)
{
if(arr2[p]==1)
str+=Integer.valueOf(p);
p--;
}
k--;
}
System.out.println(str);
t--;
}
}
}