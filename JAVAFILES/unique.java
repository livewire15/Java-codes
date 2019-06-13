import java.util.*;
import java.math.*;
class unique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
int a=sc.nextInt();
int n1=sc.nextInt();
BigInteger bg=BigInteger.valueOf(a);
//BigInteger bg1=BigInteger.valueOf(n1);
BigInteger n=bg.pow(n1);
BigInteger ten=BigInteger.valueOf(10);
BigInteger s=BigInteger.valueOf(0);
BigInteger zero=BigInteger.valueOf(0);
BigInteger nine=BigInteger.valueOf(9);
int flag=0;
int ans[]=new int[100000];
Arrays.fill(ans,0);

s=BigInteger.valueOf(0);
while(n.compareTo(zero)>0)
{
s=s.add(n.mod(ten));
n=n.divide(ten);
}

int sum=s.intValue();
int sum2=0;
if(sum>9)
{
do
{
sum2=0;
if(ans[sum]>0)
	sum2=ans[sum];
else
{
	int value=sum;
while(sum>0)
{
sum2=sum2+sum%10;
sum/=10;
}
ans[value]=sum2;
}
sum=sum2;
}while(sum2>9);

System.out.print(sum2);
}
else
	System.out.println(sum);
t--;
}
}
}