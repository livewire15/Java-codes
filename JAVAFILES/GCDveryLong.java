import java.util.Scanner;

class GCDveryLong {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
      	long a=sc.nextLong();
      	String b=sc.next();
      	int i=0;
      	long sum=0;
        if(a==0)
          System.out.println(b);
        else
        {
      	while(i<b.length())
        {
         sum=(sum*10)%a+((int)Character.valueOf(b.charAt(i++))-48)%a; 
        }
      	System.out.println(gcd(a,sum)); 
        }
		 t--;
    }
    }
  
  static long gcd(long a,long b)
  {
    if(b==0)
      return a;
    return gcd(b,a%b);
  }      
}