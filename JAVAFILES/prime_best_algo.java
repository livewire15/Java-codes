import java.util.*;
class prime_best_algo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t>0)
{
long n=sc.nextLong();
countPrimeFactors(n);
t--;
}
}
static void countPrimeFactors(long N){
      long primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
      int count = 0; 
      long pf = primes[0];
            for(int j = 1; j < primes.length && pf <= N && N != 1; j++){
                pf = pf * primes[j];
                count++;
                }
            System.out.println(count);  
    }
}	//