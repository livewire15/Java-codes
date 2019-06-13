import java.util.Scanner;

public class GCDveryLong {

	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
      	int a=sc.nextInt();
        sc.nextLine();
      	String b=sc.next();
        System.out.println(b);
      	int i=0;
      	int sum=0;
      	while(i<b.length())
        {
         sum=(sum*10)%a+Character.valueOf(b.charAt(i++))%a; 
        }
      	System.out.println(gcd(sum,a));
    }
      t--;
    }
  
  static int gcd(int a,int b)
  {
    if(b==0)
      return a;
    return gcd(b,a%b);
  }      
}