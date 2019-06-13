import java.util.*;
import java.math.*;
class vectors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
BigInteger one=BigInteger.valueOf(1);
BigInteger bg=BigInteger.valueOf(2);
BigInteger bg1=BigInteger.valueOf(n-1);
BigInteger bg2=new BigInteger("1000000007");
BigInteger bg4=BigInteger.valueOf(n);
BigInteger bg3=bg.modPow(bg1,bg2);
BigInteger bg5=(bg3.subtract(bg4)).mod(bg2);
int num=bg3.intValue();
//System.out.println(num);
int deno=modInverse(num,1000000007);
//System.out.println(deno);
BigInteger bg6=BigInteger.valueOf(deno);
System.out.println((bg5.multiply(bg6)).mod(bg2));
}

static int modInverse(int a, int m)
    {
        int m0 = m;
        int y = 0, x = 1;
 
        if (m == 1)
            return 0;
 
        while (a > 1)
        {
            // q is quotient
            int q = a / m;
 
            int t = m;
 
            // m is remainder now, process
            // same as Euclid's algo
            m = a % m;
            a = t;
            t = y;
 
            // Update x and y
            y = x - q * y;
            x = t;
        }
 
        // Make x positive
        if (x < 0)
            x += m0;
 
        return x;
    }
}