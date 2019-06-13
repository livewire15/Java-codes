import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,p,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            {
            a[i]=sc.nextInt();          
        }
        for(int i=0;i<n;i++)
            {
            p=0;
            for(int j=0;j<n;j++)
                {
                if(a[i]==a[j])
                    p++;
            }
            if(p>max)
                max=p;
        }
        System.out.println(n-max);
    }
}