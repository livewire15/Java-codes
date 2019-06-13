import java.util.*;
class chef_patents
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int m=sc.nextInt();
int x=sc.nextInt();
int k=sc.nextInt();
String s=sc.next();
int l=s.length();
int ans=0,flag=0;
int odd=0,even=0;

for(int i=0;i<l;i++)
{
	if(s.charAt(i)=='O')
	{
		odd++;
	}
	else
		even++;
}

if(n>k)
{
	System.out.println("no");
}
else
{
for(int i=1;i<=m;i++)
{	
if(i%2!=0)
{
if(odd>=x)
{
	odd=odd-x;
	ans+=x;
}
else if(odd>0)
{
	ans+=odd;
	odd=0;	
}
}
else
{
if(even>=x)
{
	even=even-x;
	ans+=x;
}
else if(even>0)
{
	ans+=even;
	even=0;	
}
}

if(ans==n)
{
System.out.println("yes");
flag=1;
break;
}
}
if(flag==0)
System.out.println("no");
}
t--;
}
}
}