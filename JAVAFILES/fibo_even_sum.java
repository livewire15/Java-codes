import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            if(n==0 || n==1)
                System.out.println(0);
            else if(n>=2 && n<=7)
                System.out.println(2);
            else
            {
            long a=0,b=2,c=2,sum=0;
            while(c<=n)
           {        
                sum+=c;
                c=4*b+a;   
                a=b;
                b=c;                         
           }
            System.out.println(sum);
    }
        }
}
}
