import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String s=" ",b=" ";
        int k=0,p=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        b=sc.nextLine();
        s=s.toLowerCase();
        b=b.toLowerCase();
        int l1=s.length();
         int l2=b.length();
        char a[]=new char[l1-1];
        for(int i=0;i<a.length;i++)
            {
            char ch=s.charAt(i);
            a[i]=ch;
        }
        while(k<l2)
            {
            if(b.charAt(k)!=' ')
                {
        for(int j=0;j<a.length;j++)
            {    
              p=0;   
            if(b.charAt(k)==a[j] && a[j]!='*')
           {    
                    p=1;
            k++;            
            a[j]='*';
            break;
        }
        }
        }
        else
            k++;
		
            if(p==0 && b.charAt(k)!=' ')
                break;
        }
        if(k==l2)
            System.out.println("YES");
        else
         System.out.print("NO");
          
            }
        }   
        
