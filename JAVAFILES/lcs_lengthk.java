import java.util.*;

public class lcs_lengthk {

	
	public static void main(String[] args) {
		// Write your code here
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
	  String b1=sc.next();
      String b2=sc.next();
      int k=sc.nextInt();
      int l1=b1.length();
      int l2=b2.length();
     fun(s1,s2,l1,l2,k,0,0);
        t--;
      }
    }
	
	public static fun(String b1,String b2,int l1,int l2,int k,int i,int j)
	{
		if(b1.charAt(i)==b2.charAt(j))
		{
			fun(b1,b2,l1,l2,k+1,i+1,j+1);
		}
			int op1=fun(b1,b2,l1,l2,k,i+1,j);
			int op2=fun(b1,b2,l1,l2,k,i,j+1);
			int ans=Math.max();
	}
	}
