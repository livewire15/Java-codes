import java.util.*;
class mockvita1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
int m=(int)s.charAt(0)-48;
int n=(int)s.charAt(2)-48;
int arr[][]=new int[m][n];
for(int i=0;i<m;i++)
{
	String str[]=sc.next().split(",");
	for(int j=0;j<str.length;j++)
	{
		arr[i][j]=Integer.parseInt(str[j]);
	}
}
int ptr[]=new int[m];
Arrays.fill(ptr,n-1);
int pos=0,max=Integer.MIN_VALUE;
String ans="";

while(ans.length()<m*n)
{
	max=Integer.MIN_VALUE;
for(int i=0;i<m;i++)
{
	int index=ptr[i];
	if(index>=0)
	{
	if(arr[i][index]>max)
	{
		max=arr[i][index];
		pos=i;
	}
	}
}
ans=ans+(char)(max+48);
ptr[pos]--;
}

System.out.println(ans);
}
}