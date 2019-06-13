import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,k,b,s=0,s1=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();
        }
         b=sc.nextInt();
        for(int i=0;i<n;i++)
         {   
            s=s+a[i];
            if(i!=k)
            s1=s1+a[i];
    }
        s1=s1/2;
        s=s/2;
        if(s1==b)
            System.out.println("Bon Appetit");
        else
            System.out.println(s-s1);
        
    }
}