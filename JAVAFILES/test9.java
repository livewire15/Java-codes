import java.util.*;
class test9
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int arr[]=new int[1001];
int arr2[]=new int[1001];
Arrays.fill(arr,0);
for(int i=1;i<=n;i++)
{
	int val=sc.nextInt();
	arr2[i]=val;
arr[val]++;
}
for(int j=1;j<arr.length;j++)
{
if(arr[arr2[j]]==1)
System.out.print(arr2[j]+" ");
}
System.out.println();
t--;
}
}
}