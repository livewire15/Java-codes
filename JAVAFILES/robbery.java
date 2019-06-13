import java.util.*;
import java.math.*;
class robbery
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int n=sc.nextInt();
int x=0;
BigInteger ten=new BigInteger("10");
BigInteger deno;
if(n%2==0)
{
	x=n/2-1;
}
else
{
	x=n/2;
}
deno=ten.pow(n-1-x);
System.out.println(1+" "+deno);
t--;
}
}
}