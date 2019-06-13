import java.math.BigInteger;
import java.util.Scanner;
 
public class Main{
 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T-- > 0) {
			long A = scn.nextLong();
			long B = scn.nextLong();
			long N = scn.nextLong();
			BigInteger val1;
			BigInteger val2;
			if (A == B) {
				val1 = power(A, N, 1000000007);
				val2 = power(B, N, 1000000007);
				val1 = val1.add(val2).mod(new BigInteger(1000000007 + ""));
				System.out.println(val1);
			} else {
				val1 = power(A, N, A - B);
				val2 = power(B, N, A - B);
				val1 = val1.add(val2).mod(new BigInteger(A - B + ""));
				System.out.println(gcd(val1, new BigInteger(A - B + "")));
			}
		}
	}
 
	public static BigInteger power(long x, long y, long p) {
		BigInteger res = new BigInteger("1");
		BigInteger X = new BigInteger(x + "");
		BigInteger P = new BigInteger(p + "");
 
		while (y > 0) {
			if ((y & 1) == 1)
				res = (res.multiply(X)).mod(P);
			y = y >> 1;
			X = (X.multiply(X)).mod(P);
		}
		return res;
	}
 
	public static BigInteger gcd(BigInteger a, BigInteger b) {
		if (a.compareTo(new BigInteger(0 + "")) == 0) {
			return b;
		}
 
		return gcd(b.mod(a), a);
	}
}
 