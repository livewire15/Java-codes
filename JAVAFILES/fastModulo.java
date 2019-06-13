//To calculate (a^b)%c in O(log n).
static int fastModulo(int a,int b,int c)
{
	if(b==0)
		return 1;
	if(b%2==0) //when even
		return fastModulo((a*a)%c,b/2,c);
	else //when odd
		return ((a%c)*fastModulo((a*a)%c,b/2,c))%c;
}

//when a and b both are large then use BigInteger for a and c(modulo) both.
/*ALTERNATIVE*/
// For (x^y)%p.
public static BigInteger power(long x, long y, long p) {
		BigInteger res = new BigInteger("1");
		BigInteger X = new BigInteger(x + "");
		BigInteger P = new BigInteger(p + "");
 
		while (y > 0)
		 {
			if ((y & 1) == 1) //if odd
				res = (res.multiply(X)).mod(P);
			y = y >> 1; //divide by 2
			X = (X.multiply(X)).mod(P);
		}
		return res;
	}