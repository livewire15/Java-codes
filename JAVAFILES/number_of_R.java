import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		// Write your code here
	  Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t>0)
      {
      String s=sc.next();
      int b[]=new int[s.length()];
      int count=0;

      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='R')
        {
          count++;
          b[i]=-1;
        }
        else
          b[i]=1;
      }
        
        if(count==s.length())
        {
          System.out.println(count-1);
        }
    else
     {      
      int sum=0,max=0;
      for(int j=0;j<s.length();j++)
      {
        sum+=b[j];
        if(sum>max)
          max=sum;
        if(sum<0)
          sum=0;
      }
      System.out.println(count+max);
      }
        t--;	
      }
    }

}