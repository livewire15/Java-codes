import java.util.*;
class p1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int arr[][]=new int[n][n];
int arr2[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sc.nextInt();
if(i==0 || j==0)
arr2[i][j]=arr[i][j];
}
}

for(int i=1;i<n;i++)
{
for(int j=1;j<n;j++)
{
arr2[i][j]=arr[i][j]+arr2[i-1][j-1];
}
}

int max=0;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(arr2[i][j]>max)
			max=arr2[i][j];
	}
}
System.out.println(max);
t--;
}
}
}