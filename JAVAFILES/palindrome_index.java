import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class palindrome_index {
 
    static String s=" ";
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String a[]=new String[t];
        String a1;
        for(int i1=0;i1<t;i1++)
            {
            a[i1]=sc.next();
        }
        for(int i=0;i<t;i++)
            {           
            int t1=0;
			a1=palindrome(a[i]);
			
            if(a[i]==a1)
          {      
                System.out.println("-1");
                break;
          }
            else
                {
            for(int j=0;j<a[i].length();j++)
                {
			   StringBuffer sb=new StringBuffer(a[i]);			  
                String p1=(sb.deleteCharAt(j)).toString();
				 System.out.println("p1="+p1);
				String p2=p1;
            String p=palindrome(p1);
			System.out.println("p="+p);
            if(p==p2)
              { 
                t1++;		  
               System.out.println(j);
               break;
            }
        }
		
                
        }
           }
	}
        
            public static String palindrome(String x)
        { 
		String s=" ";
           for(int i=x.length()-1;i>=0;i--)
            {
             s=s+x.charAt(i);   
                }
			
                return s;
            }
 }