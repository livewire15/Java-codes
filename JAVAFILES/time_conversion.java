import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class time_conversion {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int j=0,n;
		String n1=" ",s1="";
        String s=br.readLine();
        int l=s.length();
        String a[]=new String[l];
        s1=s.substring(8,10);
        for(int k=0;k<a.length;k++)
            {
            a[k]="";
        }
       for(int i=0;i<s.length()-2;i++)
           {
           char ch=s.charAt(i);
           if(ch==':')
               {
               j++;        
           }
           else
               {
               a[j]=a[j]+ch;
           }
       }
        if(s1.equals("AM"))
            {
           if(a[0].equals("12"))
               {
               System.out.println("00"+":"+a[1]+":"+a[2]);
           }
            else
            System.out.println(a[0]+":"+a[1]+":"+a[2]);
        }
        else
            {
				
            if(a[0].equals("12"))
                System.out.println(a[0]+":"+a[1]+":"+a[2]);
            else
                {								
                n=Integer.parseInt(s.substring(0,2));
                 n+=12;
       System.out.println(n+":"+a[1]+":"+a[2]);
					}
			    
       
            }
			
        }
   
        }
           
    

