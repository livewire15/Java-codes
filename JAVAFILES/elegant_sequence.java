import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class elegant_sequence {

    // Complete the maximumElegance function below.
    static int maximumElegance(int q, String[] s, int[] b) {
        // Return an integer denoting the maximum elegance which can be obtained by Diane.
        int arr[]=new int[10];
        Arrays.fill(arr,q);
        int max=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b.length-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    int temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                    
                    String val=s[j];
                    s[j]=s[j+1];
                    s[j+1]=val;
                }
            }
        }
        
        int k=0;
        int beauty[]=new int[b.length];
        for(int i=0;i<s.length;i++)
        {
            int flag=0;
            for(int j=0;j<s[i].length();j++)
            {
                char ch=s[i].charAt(j);
				int v1=((int)Character.valueOf(ch))-48;
                if(arr[v1]>0)
                {
                    arr[v1]--;
                }
                else
                {
                    flag=-1;
                    break;
                }
            }
            if(flag==0)
            {
               beauty[k++]=b[i];
            }
        }
        
        int sum=0;
		max=beauty[0];
        for(int j=k-1;j>1;j--)
        {
            sum=sum+(beauty[j]^beauty[j-1]);
        }
		sum=sum+(max^beauty[k-1]);
        sum=sum+beauty[0];
        return sum;
    }
    
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int q=sc.nextInt();
	  int b[]=new int[n];
	  String arr[]=new String[n];
	  for(int i=0;i<n;i++)
	  {
		  b[i]=sc.nextInt();
	  }
	  for(int j=0;j<n;j++)
	  {
		  arr[j]=sc.next();
	  }
	  System.out.println(maximumElegance(q,arr,b));
  }
}
