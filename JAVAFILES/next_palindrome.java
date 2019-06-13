import java.util.*;
class next_palindrome
{
public static void main(String args[])
{
int i,a,s=0,j;
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(i=0;i<t;i++)
{
int n=sc.nextInt();

for(j=n+1;j<1000000;j++)
{
a=j;
s=0;
while(a>0)
{
s=s*10+a%10;
a/=10;
}
if(s==j)
{
System.out.println(s);
break;
}
}
}
}
}