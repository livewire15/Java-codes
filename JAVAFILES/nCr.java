	//To calculate nCr
    int fac[];
    //precompute all factorial values 
    static long power(long x, long y, long p) 
    {  
        long res = 1; 
        x = x % p;      
        while (y > 0) 
        { 
            if (y % 2 == 1) 
                res = (res * x) % p; 
            y = y >> 1;
            x = (x * x) % p; 
        } 
        return res; 
    } 
    static long modInverse(long n, long p) 
    { 
        return power(n, p-2, p); 
    } 
    static long nCrModPFermat(long n, long r, long p) 
    { 
        if (r == 0) 
            return 1; 
        return (fac[(int)n]* modInverse(fac[(int)r], p) % p * modInverse(fac[(int)(n-r)], p) % p) % p; 
    }