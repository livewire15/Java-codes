import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int p=0,r=0,p1=0;
        long a;
        for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)=='a')
                p++;
        }
        a=(long)Math.floor(n/s.length());
        r=(int)(n%s.length());
        if(r>0)
        {
            for(int i=0;i<r;i++)
                {
                if(s.charAt(i)=='a')
                    p1++;
            }
        }
        System.out.print(a*p+p1);
    }
}
