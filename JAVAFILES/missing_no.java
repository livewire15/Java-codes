import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class missing_no {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a1,b1,temp,p=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();           
        }
        int m=sc.nextInt();
        int b[]=new int[m];
        int c[]=new int[m];
        for(int j=0;j<m;j++)
            {
            b[j]=sc.nextInt();          
        }
        
        for(int i=0;i<n;i++)
            {
            if(a[i]!=0)
          {                           
            a1=1;b1=0;
            for(int j=i+1;j<n;j++)
                {
                if(a[i]==a[j])
                    {                   
                    a[j]=0;
                    a1++;
            }
				}			
            for(int k=0;k<m;k++)
                {			
                if(a[i]==b[k])
                    b1++;
            }
            if(a1==b1)
                continue;
            else
			{ 
		     c[p]=a[i];
			p++;
            }      
        }
			}
        for(int l=0;l<c.length;l++)
    {
            for(int l1=0;l1<(c.length-l-1);l1++)
                {
					if(c[l1]!=0)
					{
                if(c[l1]>c[l1+1])
                    {
                    temp=c[l1];
                    c[l1]=c[l1+1];
                    c[l1+1]=temp;
                }
            }
        }
	}
        for(int l2=0;l2<c.length;l2++)
            {
				if(c[l2]!=0)
            System.out.print(c[l2]+" ");
        }
    }
}
