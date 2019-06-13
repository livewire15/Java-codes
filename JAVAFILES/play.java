/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.io.*;
import java.util.*;

class play {
    public static void main(String args[] ) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        int n=Character.getNumericValue(str.charAt(0));
        int q=Character.getNumericValue(str.charAt(2));
        int arr[]=new int[n+1];
         long dup[]=new long[n+1];
         long sum=0;
         dup[0]=0;
         String s=br.readLine();
         s=s+" ";
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.valueOf(s.substring(0,s.indexOf(" ")));
            sum+=arr[i];
            dup[i+1]=sum;
            s=s.substring(s.indexOf(" ")+1);
        }
		
		for(int i=0;i<=n;i++)
		{
			System.out.println("sum "+dup[i]);
		}
        for(int j=0;j<q;j++)
        {
           String s1=br.readLine();
           int q1=Character.getNumericValue(s1.charAt(0));
           int q2=Character.getNumericValue(s1.charAt(2));
            System.out.println((int)Math.floor((dup[q2]-dup[q1-1])/(q2-q1+1)));
        }
    }
}
        
        

      
