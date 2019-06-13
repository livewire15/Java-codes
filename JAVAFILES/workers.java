import java.util.*;
class workers
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
int min1=100000,min2=100000,min3=100000;
for(int i=0;i<n;i++)
{
arr1[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
arr2[j]=sc.nextInt();
}

for(int i=0;i<n;i++)
{
if(arr2[i]==1 && arr1[i]<min1)
{
min1=arr1[i];
}
else if(arr2[i]==2 && arr1[i]<min2)
{
min2=arr[i];
}
else if(arr2[i]==3 && arr1[i]<min3)
{
min3=arr1[i];
}
}
System.out.println(((min1+min2)>min3)?min3:min1+min2);
}
}
