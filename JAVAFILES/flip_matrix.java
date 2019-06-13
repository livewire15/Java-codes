import java.util.*;
class flip_matrix
{
public static void main(String args[])
{
	int i,j;
Scanner sc=new Scanner(System.in);
int q=sc.nextInt();
for(i=0;i<q;i++)
{
int n=sc.nextInt();
long s=0;
int arr[][]=new int[2*n][2*n];
for(i=0;i<2*n;i++)
{
for(j=0;j<2*n;j++)
{
arr[i][j]=sc.nextInt();
}
}
int m=2*n;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
s=s+(long)max(arr[i][j],arr[i][m-1-j],arr[m-1-i][j],arr[m-1-i][m-1-j]);
}
}
System.out.println(s);
}
}

public static int max(int a1,int a2,int a3,int a4)
{
int array[]=new int[4];
array[0]=a1;
array[1]=a2;
array[2]=a3;
array[3]=a4;
Arrays.sort(array);
return array[3];
}
}