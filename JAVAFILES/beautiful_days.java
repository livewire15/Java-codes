import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class beautiful_days {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i,j,k,p=0,i2;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        for(int i1=i;i1<=j;i1++)
            {
            i2=reversed(i1);
            if(Math.abs(i2-i1)%k==0)
                p++;
        }
        System.out.println(p);
    }
    
    public static int reversed(int n)
        { 
        int s=0;
        while(n>0)
            {
            s=s*10+n%10;
            n=n/10;
        }
         return s;
    }
}