// C++ program to find count of divisors in n!
#include<bits/stdc++.h>
using namespace std;
typedef unsigned long long int ull;

// allPrimes[] stores all prime numbers less
// than or equal to n.
vector<ull> allPrimes;

// Fills above vector allPrimes[] for a given n
void sieve(int n)
{
	// Create a boolean array "prime[0..n]" and
	// initialize all entries it as true. A value
	// in prime[i] will finally be false if i is
	// not a prime, else true.
	vector<bool> prime(n+1, true);

	// Loop to update prime[]
	for (int p=2; p*p<=n; p++)
	{
		// If prime[p] is not changed, then it
		// is a prime
		if (prime[p] == true)
		{
			// Update all multiples of p
			for (int i=p*2; i<=n; i += p)
				prime[i] = false;
		}
	}

	// Store primes in the vector allPrimes
	for (int p=2; p<=n; p++)
		if (prime[p])
			allPrimes.push_back(p);
}

// Function to find all result of factorial number
ull factorialDivisors(ull n)
{
	sieve(n); // create sieve

	// Initialize result
	ull result = 1;

	// find exponents of all primes which divides n
	// and less than n
	for (int i=0; i < allPrimes.size(); i++)
	{
		// Current divisor
		ull p = allPrimes[i];

		// Find the highest power (stored in exp)'
		// of allPrimes[i] that divides n using
		// Legendre's formula.
		ull exp = 0;
		cout<<"n= "<<n<<endl;
		while (p <= n)
		{
			exp = exp + (n/p);
			p = p*allPrimes[i];
			cout<<"exp= "<<exp<<endl;
		}

		// Multiply exponents of all primes less
		// than n
		result = result*(exp+1);
	}

	// return total divisors
	return result;
}

// Driver program to run the cases
int main()
{
	cout << factorialDivisors(4);
	return 0;
}
