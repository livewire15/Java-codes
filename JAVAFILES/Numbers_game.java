import java.util.*;
class Numbers_game
{
public static void main(String args[])
{
int n,p=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++)
{
	a[j]=sc.nextInt();
}
for(int i=0;i<(n-1);i++)
{
if((a[i]%10)!=(a[i+1]/10))
{
	p++;
}
}
System.out.print(p);
}
}