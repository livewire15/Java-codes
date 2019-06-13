import java.util.*;
class test18
{		
	static boolean prime[] = new boolean[101];
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sieveOfEratosthenes(100);
		while(t>0)
		{
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++)
		{
		arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		for(int j=0;j<n;j++)
		{
		if(i!=j)
		{
		if(arr[j]%arr[i]==0)
		{
		int s1=prime(arr[j]);
		int s2=prime(arr[i]);
		if(s1%s2==0)
			count++;
		}
		}
		}
		}
		System.out.println(count);
		t--;
		}
		}

		static void sieveOfEratosthenes(int n)
		{
        for(int i=0;i<n;i++)
            prime[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*2; i <= n; i += p)
                    prime[i] = false;
            }
        }
	}
         
		static int prime(int n)
		 {
        // Print all prime numbers
		int sum=0;
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                sum+=i;
        }
		return sum;
    }
}