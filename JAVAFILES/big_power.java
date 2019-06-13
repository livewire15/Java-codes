import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class big_power
{
public static void main(String args[])
{
String a,b;
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
a=sc.next();
b=sc.next();
BigInteger bg1=new BigInteger(a);
BigInteger bg3=new BigInteger("1000000007");
BigInteger bg2=new BigInteger(b);
BigInteger bg4;

bg4=bg1.modPow(bg2,bg3);

}
}
}