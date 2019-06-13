import java.util.*;
class tojo_cc
{
public static void main(String args[])
{
int t;
Scanner sc=new Scanner(System.in);
t=sc.nextInt();
for(int i=0;i<t;i++)
{
double s=0.0;
int n=sc.nextInt();
int m=sc.nextInt();
for(int j=1;j<=n;j++)
{
for(int k=1;k<=m;k++)
{
	if(m==1 || n==1)
		s=s+1.0;
else if((j==1 && k==1)||(j==n && k==m))
s=s+1.0;
else 
s=s+0.5;
}
}
String sf2=String.format("%.6f",s);  
System.out.println(sf2);
}
}
}